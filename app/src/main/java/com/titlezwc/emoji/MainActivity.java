package com.titlezwc.emoji;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;

/**
 * http://blog.csdn.net/isee361820238/article/details/52425399
 * <p>
 * http://apps.timwhitlock.info/emoji/tables/unicode
 * <p>
 * 1F601 - 1F64F
 */
public class MainActivity extends AppCompatActivity implements EmojiAdapter.OnEmojiClickListener {

    private EditText editText;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.et_emoji_shower);
        recyclerView = (RecyclerView) findViewById(R.id.rv_emoji_choose);

        initRecyclerView();
    }

    private void initRecyclerView() {
        EmojiAdapter adapter = new EmojiAdapter(this, this);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 6));
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onEmojiCLick(String emoji) {
        editText.setText(editText.getText().append(emoji));
        editText.setSelection(editText.getText().length());
    }
}
