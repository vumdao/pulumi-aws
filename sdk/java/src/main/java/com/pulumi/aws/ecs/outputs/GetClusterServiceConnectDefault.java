// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterServiceConnectDefault {
    private String namespace;

    private GetClusterServiceConnectDefault() {}
    public String namespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterServiceConnectDefault defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String namespace;
        public Builder() {}
        public Builder(GetClusterServiceConnectDefault defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        @CustomType.Setter
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public GetClusterServiceConnectDefault build() {
            final var o = new GetClusterServiceConnectDefault();
            o.namespace = namespace;
            return o;
        }
    }
}