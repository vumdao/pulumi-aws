// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs Empty = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs();

    @Import(name="audioRenditionSets")
    private @Nullable Output<String> audioRenditionSets;

    public Optional<Output<String>> audioRenditionSets() {
        return Optional.ofNullable(this.audioRenditionSets);
    }

    @Import(name="nielsenId3Behavior")
    private @Nullable Output<String> nielsenId3Behavior;

    public Optional<Output<String>> nielsenId3Behavior() {
        return Optional.ofNullable(this.nielsenId3Behavior);
    }

    @Import(name="timedMetadataBehavior")
    private @Nullable Output<String> timedMetadataBehavior;

    public Optional<Output<String>> timedMetadataBehavior() {
        return Optional.ofNullable(this.timedMetadataBehavior);
    }

    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs() {}

    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs(ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs $) {
        this.audioRenditionSets = $.audioRenditionSets;
        this.nielsenId3Behavior = $.nielsenId3Behavior;
        this.timedMetadataBehavior = $.timedMetadataBehavior;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs();
        }

        public Builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs defaults) {
            $ = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder audioRenditionSets(@Nullable Output<String> audioRenditionSets) {
            $.audioRenditionSets = audioRenditionSets;
            return this;
        }

        public Builder audioRenditionSets(String audioRenditionSets) {
            return audioRenditionSets(Output.of(audioRenditionSets));
        }

        public Builder nielsenId3Behavior(@Nullable Output<String> nielsenId3Behavior) {
            $.nielsenId3Behavior = nielsenId3Behavior;
            return this;
        }

        public Builder nielsenId3Behavior(String nielsenId3Behavior) {
            return nielsenId3Behavior(Output.of(nielsenId3Behavior));
        }

        public Builder timedMetadataBehavior(@Nullable Output<String> timedMetadataBehavior) {
            $.timedMetadataBehavior = timedMetadataBehavior;
            return this;
        }

        public Builder timedMetadataBehavior(String timedMetadataBehavior) {
            return timedMetadataBehavior(Output.of(timedMetadataBehavior));
        }

        public ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs build() {
            return $;
        }
    }

}