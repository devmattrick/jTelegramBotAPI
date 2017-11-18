package io.jtelegram.api.message.impl;

import io.jtelegram.api.message.Message;
import io.jtelegram.api.message.entity.MessageEntity;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class TextMessage extends Message<String> {
    private String text;
    private List<MessageEntity> entities = new ArrayList<>();

    @Override
    public String getContent() {
        return text;
    }
}
