// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionRemixSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsAudioDescriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsAudioDescriptionArgs Empty = new ChannelEncoderSettingsAudioDescriptionArgs();

    /**
     * Advanced audio normalization settings. See Audio Normalization Settings for more details.
     * 
     */
    @Import(name="audioNormalizationSettings")
    private @Nullable Output<ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettingsArgs> audioNormalizationSettings;

    /**
     * @return Advanced audio normalization settings. See Audio Normalization Settings for more details.
     * 
     */
    public Optional<Output<ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettingsArgs>> audioNormalizationSettings() {
        return Optional.ofNullable(this.audioNormalizationSettings);
    }

    /**
     * The name of the audio selector used as the source for this AudioDescription.
     * 
     */
    @Import(name="audioSelectorName", required=true)
    private Output<String> audioSelectorName;

    /**
     * @return The name of the audio selector used as the source for this AudioDescription.
     * 
     */
    public Output<String> audioSelectorName() {
        return this.audioSelectorName;
    }

    /**
     * Applies only if audioTypeControl is useConfigured. The values for audioType are defined in ISO-IEC 13818-1.
     * 
     */
    @Import(name="audioType")
    private @Nullable Output<String> audioType;

    /**
     * @return Applies only if audioTypeControl is useConfigured. The values for audioType are defined in ISO-IEC 13818-1.
     * 
     */
    public Optional<Output<String>> audioType() {
        return Optional.ofNullable(this.audioType);
    }

    /**
     * Determined how audio type is determined.
     * 
     */
    @Import(name="audioTypeControl")
    private @Nullable Output<String> audioTypeControl;

    /**
     * @return Determined how audio type is determined.
     * 
     */
    public Optional<Output<String>> audioTypeControl() {
        return Optional.ofNullable(this.audioTypeControl);
    }

    /**
     * Settings to configure one or more solutions that insert audio watermarks in the audio encode. See Audio Watermark Settings for more details.
     * 
     */
    @Import(name="audioWatermarkSettings")
    private @Nullable Output<ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsArgs> audioWatermarkSettings;

    /**
     * @return Settings to configure one or more solutions that insert audio watermarks in the audio encode. See Audio Watermark Settings for more details.
     * 
     */
    public Optional<Output<ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsArgs>> audioWatermarkSettings() {
        return Optional.ofNullable(this.audioWatermarkSettings);
    }

    /**
     * The video codec settings. See Video Codec Settings for more details.
     * 
     */
    @Import(name="codecSettings")
    private @Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs> codecSettings;

    /**
     * @return The video codec settings. See Video Codec Settings for more details.
     * 
     */
    public Optional<Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs>> codecSettings() {
        return Optional.ofNullable(this.codecSettings);
    }

    /**
     * When specified this field indicates the three letter language code of the caption track to extract from the source.
     * 
     */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    /**
     * @return When specified this field indicates the three letter language code of the caption track to extract from the source.
     * 
     */
    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    @Import(name="languageCodeControl")
    private @Nullable Output<String> languageCodeControl;

    public Optional<Output<String>> languageCodeControl() {
        return Optional.ofNullable(this.languageCodeControl);
    }

    /**
     * The name of the video description.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the video description.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="remixSettings")
    private @Nullable Output<ChannelEncoderSettingsAudioDescriptionRemixSettingsArgs> remixSettings;

    public Optional<Output<ChannelEncoderSettingsAudioDescriptionRemixSettingsArgs>> remixSettings() {
        return Optional.ofNullable(this.remixSettings);
    }

    /**
     * Stream name RTMP destinations (URLs of type rtmp://)
     * 
     */
    @Import(name="streamName")
    private @Nullable Output<String> streamName;

    /**
     * @return Stream name RTMP destinations (URLs of type rtmp://)
     * 
     */
    public Optional<Output<String>> streamName() {
        return Optional.ofNullable(this.streamName);
    }

    private ChannelEncoderSettingsAudioDescriptionArgs() {}

    private ChannelEncoderSettingsAudioDescriptionArgs(ChannelEncoderSettingsAudioDescriptionArgs $) {
        this.audioNormalizationSettings = $.audioNormalizationSettings;
        this.audioSelectorName = $.audioSelectorName;
        this.audioType = $.audioType;
        this.audioTypeControl = $.audioTypeControl;
        this.audioWatermarkSettings = $.audioWatermarkSettings;
        this.codecSettings = $.codecSettings;
        this.languageCode = $.languageCode;
        this.languageCodeControl = $.languageCodeControl;
        this.name = $.name;
        this.remixSettings = $.remixSettings;
        this.streamName = $.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsAudioDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsAudioDescriptionArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsAudioDescriptionArgs();
        }

        public Builder(ChannelEncoderSettingsAudioDescriptionArgs defaults) {
            $ = new ChannelEncoderSettingsAudioDescriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audioNormalizationSettings Advanced audio normalization settings. See Audio Normalization Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder audioNormalizationSettings(@Nullable Output<ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettingsArgs> audioNormalizationSettings) {
            $.audioNormalizationSettings = audioNormalizationSettings;
            return this;
        }

        /**
         * @param audioNormalizationSettings Advanced audio normalization settings. See Audio Normalization Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder audioNormalizationSettings(ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettingsArgs audioNormalizationSettings) {
            return audioNormalizationSettings(Output.of(audioNormalizationSettings));
        }

        /**
         * @param audioSelectorName The name of the audio selector used as the source for this AudioDescription.
         * 
         * @return builder
         * 
         */
        public Builder audioSelectorName(Output<String> audioSelectorName) {
            $.audioSelectorName = audioSelectorName;
            return this;
        }

        /**
         * @param audioSelectorName The name of the audio selector used as the source for this AudioDescription.
         * 
         * @return builder
         * 
         */
        public Builder audioSelectorName(String audioSelectorName) {
            return audioSelectorName(Output.of(audioSelectorName));
        }

        /**
         * @param audioType Applies only if audioTypeControl is useConfigured. The values for audioType are defined in ISO-IEC 13818-1.
         * 
         * @return builder
         * 
         */
        public Builder audioType(@Nullable Output<String> audioType) {
            $.audioType = audioType;
            return this;
        }

        /**
         * @param audioType Applies only if audioTypeControl is useConfigured. The values for audioType are defined in ISO-IEC 13818-1.
         * 
         * @return builder
         * 
         */
        public Builder audioType(String audioType) {
            return audioType(Output.of(audioType));
        }

        /**
         * @param audioTypeControl Determined how audio type is determined.
         * 
         * @return builder
         * 
         */
        public Builder audioTypeControl(@Nullable Output<String> audioTypeControl) {
            $.audioTypeControl = audioTypeControl;
            return this;
        }

        /**
         * @param audioTypeControl Determined how audio type is determined.
         * 
         * @return builder
         * 
         */
        public Builder audioTypeControl(String audioTypeControl) {
            return audioTypeControl(Output.of(audioTypeControl));
        }

        /**
         * @param audioWatermarkSettings Settings to configure one or more solutions that insert audio watermarks in the audio encode. See Audio Watermark Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder audioWatermarkSettings(@Nullable Output<ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsArgs> audioWatermarkSettings) {
            $.audioWatermarkSettings = audioWatermarkSettings;
            return this;
        }

        /**
         * @param audioWatermarkSettings Settings to configure one or more solutions that insert audio watermarks in the audio encode. See Audio Watermark Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder audioWatermarkSettings(ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsArgs audioWatermarkSettings) {
            return audioWatermarkSettings(Output.of(audioWatermarkSettings));
        }

        /**
         * @param codecSettings The video codec settings. See Video Codec Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder codecSettings(@Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs> codecSettings) {
            $.codecSettings = codecSettings;
            return this;
        }

        /**
         * @param codecSettings The video codec settings. See Video Codec Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder codecSettings(ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs codecSettings) {
            return codecSettings(Output.of(codecSettings));
        }

        /**
         * @param languageCode When specified this field indicates the three letter language code of the caption track to extract from the source.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode When specified this field indicates the three letter language code of the caption track to extract from the source.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        public Builder languageCodeControl(@Nullable Output<String> languageCodeControl) {
            $.languageCodeControl = languageCodeControl;
            return this;
        }

        public Builder languageCodeControl(String languageCodeControl) {
            return languageCodeControl(Output.of(languageCodeControl));
        }

        /**
         * @param name The name of the video description.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the video description.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder remixSettings(@Nullable Output<ChannelEncoderSettingsAudioDescriptionRemixSettingsArgs> remixSettings) {
            $.remixSettings = remixSettings;
            return this;
        }

        public Builder remixSettings(ChannelEncoderSettingsAudioDescriptionRemixSettingsArgs remixSettings) {
            return remixSettings(Output.of(remixSettings));
        }

        /**
         * @param streamName Stream name RTMP destinations (URLs of type rtmp://)
         * 
         * @return builder
         * 
         */
        public Builder streamName(@Nullable Output<String> streamName) {
            $.streamName = streamName;
            return this;
        }

        /**
         * @param streamName Stream name RTMP destinations (URLs of type rtmp://)
         * 
         * @return builder
         * 
         */
        public Builder streamName(String streamName) {
            return streamName(Output.of(streamName));
        }

        public ChannelEncoderSettingsAudioDescriptionArgs build() {
            $.audioSelectorName = Objects.requireNonNull($.audioSelectorName, "expected parameter 'audioSelectorName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}