package com.xander.interactivestory.Model;

public class Choice {
    private int textId;
    private int nextPage;

    public Choice(final int textId, final int nextPage) {
        this.textId = textId;
        this.nextPage = nextPage;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(final int textId) {
        this.textId = textId;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(final int nextPage) {
        this.nextPage = nextPage;
    }
}
