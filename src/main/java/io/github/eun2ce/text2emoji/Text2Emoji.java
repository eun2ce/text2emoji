package io.github.eun2ce.text2emoji;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Text2Emoji {

  private static final Map<String, String> emojiMap = new HashMap<>();
  private static Text2Emoji instance;
  private final String emojiDictFileName = "emojidict.json";

  private Text2Emoji() {
    loadEmojisFromFile();
  }

  // 싱글톤 인스턴스를 반환하는 메서드
  public static Text2Emoji getInstance() {
    if (instance == null) {
      synchronized (Text2Emoji.class) {
        if (instance == null) {
          instance = new Text2Emoji();
        }
      }
    }
    return instance;
  }

  // static 메서드로 이모티콘 삽입 기능을 제공
  public static String insertEmoji(String text) {
    return getInstance().insertEmojiInternal(text);
  }

  // 실제 이모티콘 삽입 기능을 처리하는 내부 메서드
  private String insertEmojiInternal(String text) {
    for (Map.Entry<String, String> entry : emojiMap.entrySet()) {
      if (text.contains(entry.getKey())) {
        text = text.replace(entry.getKey(), entry.getKey() + " " + entry.getValue());
      }
    }
    return text;
  }

  private void loadEmojisFromFile() {
    try (InputStream inputStream = Text2Emoji.class.getResourceAsStream(emojiDictFileName)) {
      if (inputStream == null) {
        System.out.println("file not found");
        return;
      }

      try (InputStreamReader reader = new InputStreamReader(inputStream)) {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(reader);

        for (Object key : jsonObject.keySet()) {
          String emoji = (String) key;
          JSONArray emotions = (JSONArray) jsonObject.get(key);
          for (Object emotion : emotions) {
            emojiMap.put((String) emotion, emoji);
          }
        }
      }

    } catch (IOException | org.json.simple.parser.ParseException e) {
      e.printStackTrace();
    }
  }
}
