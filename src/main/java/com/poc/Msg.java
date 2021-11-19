package com.poc;

import java.util.UUID;

public class Msg {

    private final String content;
    private final int chunks;
    private final int chunkNumber;
    private final UUID id;

    public Msg(String content, int chunks, int chunkNumber, UUID id) {
        this.content = content;
        this.chunks = chunks;
        this.chunkNumber = chunkNumber;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public int getChunks() {
        return chunks;
    }

    public int getChunkNumber() {
        return chunkNumber;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "content='" + content + '\'' +
                ", chunks=" + chunks +
                ", chunkNumber=" + chunkNumber +
                ", id=" + id +
                '}';
    }
}
