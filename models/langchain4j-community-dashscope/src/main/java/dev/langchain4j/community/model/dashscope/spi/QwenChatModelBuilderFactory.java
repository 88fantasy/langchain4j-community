package dev.langchain4j.community.model.dashscope.spi;

import dev.langchain4j.community.model.dashscope.QwenChatModel;

import java.util.function.Supplier;

/**
 * A factory for building {@link QwenChatModel.QwenChatModelBuilder} instances.
 */
public interface QwenChatModelBuilderFactory extends Supplier<QwenChatModel.QwenChatModelBuilder> {
}
