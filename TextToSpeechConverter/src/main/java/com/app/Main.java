package com.app;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Main {
  public static void main(String[] args) {

    System.setProperty(
        "freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");

    Voice voice = VoiceManager.getInstance().getVoice("kevin16");
    Voice[] voiceList = VoiceManager.getInstance().getVoices();

    if (voice != null) {
      voice.allocate();
      boolean status = voice.speak("Sa re ga ma pa dha ni saa");
      voice.deallocate();
    }
  }
}
