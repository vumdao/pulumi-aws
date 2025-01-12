// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttp2RouteActionRewrite;
import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttp2RouteActionTarget;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayRouteSpecHttp2RouteAction {
    /**
     * @return Gateway route action to rewrite.
     * 
     */
    private @Nullable GatewayRouteSpecHttp2RouteActionRewrite rewrite;
    /**
     * @return Target that traffic is routed to when a request matches the gateway route.
     * 
     */
    private GatewayRouteSpecHttp2RouteActionTarget target;

    private GatewayRouteSpecHttp2RouteAction() {}
    /**
     * @return Gateway route action to rewrite.
     * 
     */
    public Optional<GatewayRouteSpecHttp2RouteActionRewrite> rewrite() {
        return Optional.ofNullable(this.rewrite);
    }
    /**
     * @return Target that traffic is routed to when a request matches the gateway route.
     * 
     */
    public GatewayRouteSpecHttp2RouteActionTarget target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttp2RouteAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GatewayRouteSpecHttp2RouteActionRewrite rewrite;
        private GatewayRouteSpecHttp2RouteActionTarget target;
        public Builder() {}
        public Builder(GatewayRouteSpecHttp2RouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rewrite = defaults.rewrite;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder rewrite(@Nullable GatewayRouteSpecHttp2RouteActionRewrite rewrite) {

            this.rewrite = rewrite;
            return this;
        }
        @CustomType.Setter
        public Builder target(GatewayRouteSpecHttp2RouteActionTarget target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("GatewayRouteSpecHttp2RouteAction", "target");
            }
            this.target = target;
            return this;
        }
        public GatewayRouteSpecHttp2RouteAction build() {
            final var _resultValue = new GatewayRouteSpecHttp2RouteAction();
            _resultValue.rewrite = rewrite;
            _resultValue.target = target;
            return _resultValue;
        }
    }
}
