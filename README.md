# text2emoji

```java
public class Main {
  public static void main(String[] args) {
    String inputText1 = "I'm feeling happy today!";
    String inputText2 = "I am so sad right now!";
    String inputText3 = "That was so funny, haha!";

    System.out.println("Test 1: " + Text2Emoji.insertEmoji(inputText1));  // 예상: I'm feeling 😊 today!
    System.out.println("Test 2: " + Text2Emoji.insertEmoji(inputText2));  // 예상: I am so 😢 right now!
    System.out.println("Test 3: " + Text2Emoji.insertEmoji(inputText3));  // 예상: That was so 😂, haha!
  }
}
```

```bash
Test 1: I'm feeling 😊 today!
Test 2: I am so 😢 right now!
Test 3: That was so 😂, haha!
```