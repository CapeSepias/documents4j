package com.documents4j.job;

import com.documents4j.api.IFileConsumer;
import com.google.common.base.MoreObjects;

import java.io.File;

class NoopFileConsumer implements IFileConsumer {

    NoopFileConsumer() {
        /* empty */
    }

    @Override
    public void onComplete(File file) {
        /* do nothing */
    }

    @Override
    public void onCancel(File file) {
        /* do nothing */
    }

    @Override
    public void onException(File file, Exception e) {
        /* do nothing */
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(NoopFileConsumer.class)
                .addValue("<singleton>")
                .toString();
    }
}
