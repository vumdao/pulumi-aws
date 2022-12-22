// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InputDestination {
    /**
     * @return A unique name for the location the RTMP stream is being pushed to.
     * 
     */
    private String streamName;

    private InputDestination() {}
    /**
     * @return A unique name for the location the RTMP stream is being pushed to.
     * 
     */
    public String streamName() {
        return this.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String streamName;
        public Builder() {}
        public Builder(InputDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.streamName = defaults.streamName;
        }

        @CustomType.Setter
        public Builder streamName(String streamName) {
            this.streamName = Objects.requireNonNull(streamName);
            return this;
        }
        public InputDestination build() {
            final var o = new InputDestination();
            o.streamName = streamName;
            return o;
        }
    }
}