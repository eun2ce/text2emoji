# text2emoji

[![Maven Central](https://img.shields.io/maven-central/v/io.github.eun2ce/text2emoji.svg)](https://central.sonatype.com/artifact/io.github.eun2ce/text2emoji)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](LICENSE)

Text2Emoji is a Java library that automatically converts emotion words in text to corresponding emojis.

## Getting Started

### Install

#### gradle

```groovy
implementation 'io.github.eun2ce:text2emoji:0.2.0'
```

#### Maven

```xml
<dependency>
    <groupId>io.github.eun2ce</groupId>
    <artifactId>text2emoji</artifactId>
    <version>0.2.0</version>
</dependency>
```

### Quick Start

```java
public class Main {
  public static void main(String[] args) {
    String inputText1 = "I'm feeling happy today!";
    String inputText2 = "I am so sad right now!";
    String inputText3 = "That was so funny, haha!";

    System.out.println("Test 1: " + Text2Emoji.insertEmoji(inputText1));
    System.out.println("Test 2: " + Text2Emoji.insertEmoji(inputText2));
    System.out.println("Test 3: " + Text2Emoji.insertEmoji(inputText3));
  }
}

// result
// Test 1: I'm feeling 😊 today!
// Test 2: I am so 😢 right now!
// Test 3: That was so 😂, haha!
```

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

## Author

eun2ce - [GitHub](https://github.com/eun2ce)

---

© 2024 Text2Emoji. All rights reserved.