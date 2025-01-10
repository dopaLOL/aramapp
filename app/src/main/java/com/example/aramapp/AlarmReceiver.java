package com.example.aramapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // アラームが鳴ったときの処理
        Toast.makeText(context, "アラームが鳴っています！", Toast.LENGTH_SHORT).show();

        // アラーム音を鳴らす
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.alarm_sound); // 音声ファイルは res/raw に置く
        mediaPlayer.start();
    }
}
