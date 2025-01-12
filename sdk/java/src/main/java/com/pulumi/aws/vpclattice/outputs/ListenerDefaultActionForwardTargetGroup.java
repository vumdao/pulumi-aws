// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.vpclattice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerDefaultActionForwardTargetGroup {
    private @Nullable String targetGroupIdentifier;
    private @Nullable Integer weight;

    private ListenerDefaultActionForwardTargetGroup() {}
    public Optional<String> targetGroupIdentifier() {
        return Optional.ofNullable(this.targetGroupIdentifier);
    }
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionForwardTargetGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String targetGroupIdentifier;
        private @Nullable Integer weight;
        public Builder() {}
        public Builder(ListenerDefaultActionForwardTargetGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetGroupIdentifier = defaults.targetGroupIdentifier;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder targetGroupIdentifier(@Nullable String targetGroupIdentifier) {

            this.targetGroupIdentifier = targetGroupIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder weight(@Nullable Integer weight) {

            this.weight = weight;
            return this;
        }
        public ListenerDefaultActionForwardTargetGroup build() {
            final var _resultValue = new ListenerDefaultActionForwardTargetGroup();
            _resultValue.targetGroupIdentifier = targetGroupIdentifier;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
