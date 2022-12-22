// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.inputs;

import com.pulumi.aws.opsworks.inputs.MysqlLayerLoadBasedAutoScalingDownscalingArgs;
import com.pulumi.aws.opsworks.inputs.MysqlLayerLoadBasedAutoScalingUpscalingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MysqlLayerLoadBasedAutoScalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final MysqlLayerLoadBasedAutoScalingArgs Empty = new MysqlLayerLoadBasedAutoScalingArgs();

    @Import(name="downscaling")
    private @Nullable Output<MysqlLayerLoadBasedAutoScalingDownscalingArgs> downscaling;

    public Optional<Output<MysqlLayerLoadBasedAutoScalingDownscalingArgs>> downscaling() {
        return Optional.ofNullable(this.downscaling);
    }

    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    @Import(name="upscaling")
    private @Nullable Output<MysqlLayerLoadBasedAutoScalingUpscalingArgs> upscaling;

    public Optional<Output<MysqlLayerLoadBasedAutoScalingUpscalingArgs>> upscaling() {
        return Optional.ofNullable(this.upscaling);
    }

    private MysqlLayerLoadBasedAutoScalingArgs() {}

    private MysqlLayerLoadBasedAutoScalingArgs(MysqlLayerLoadBasedAutoScalingArgs $) {
        this.downscaling = $.downscaling;
        this.enable = $.enable;
        this.upscaling = $.upscaling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MysqlLayerLoadBasedAutoScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlLayerLoadBasedAutoScalingArgs $;

        public Builder() {
            $ = new MysqlLayerLoadBasedAutoScalingArgs();
        }

        public Builder(MysqlLayerLoadBasedAutoScalingArgs defaults) {
            $ = new MysqlLayerLoadBasedAutoScalingArgs(Objects.requireNonNull(defaults));
        }

        public Builder downscaling(@Nullable Output<MysqlLayerLoadBasedAutoScalingDownscalingArgs> downscaling) {
            $.downscaling = downscaling;
            return this;
        }

        public Builder downscaling(MysqlLayerLoadBasedAutoScalingDownscalingArgs downscaling) {
            return downscaling(Output.of(downscaling));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public Builder upscaling(@Nullable Output<MysqlLayerLoadBasedAutoScalingUpscalingArgs> upscaling) {
            $.upscaling = upscaling;
            return this;
        }

        public Builder upscaling(MysqlLayerLoadBasedAutoScalingUpscalingArgs upscaling) {
            return upscaling(Output.of(upscaling));
        }

        public MysqlLayerLoadBasedAutoScalingArgs build() {
            return $;
        }
    }

}