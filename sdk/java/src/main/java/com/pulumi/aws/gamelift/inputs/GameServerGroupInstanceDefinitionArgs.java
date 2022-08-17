// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GameServerGroupInstanceDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GameServerGroupInstanceDefinitionArgs Empty = new GameServerGroupInstanceDefinitionArgs();

    /**
     * An EC2 instance type.
     * 
     */
    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    /**
     * @return An EC2 instance type.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }

    /**
     * Instance weighting that indicates how much this instance type contributes
     * to the total capacity of a game server group.
     * Instance weights are used by GameLift FleetIQ to calculate the instance type&#39;s cost per unit hour and better identify
     * the most cost-effective options.
     * 
     */
    @Import(name="weightedCapacity")
    private @Nullable Output<String> weightedCapacity;

    /**
     * @return Instance weighting that indicates how much this instance type contributes
     * to the total capacity of a game server group.
     * Instance weights are used by GameLift FleetIQ to calculate the instance type&#39;s cost per unit hour and better identify
     * the most cost-effective options.
     * 
     */
    public Optional<Output<String>> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    private GameServerGroupInstanceDefinitionArgs() {}

    private GameServerGroupInstanceDefinitionArgs(GameServerGroupInstanceDefinitionArgs $) {
        this.instanceType = $.instanceType;
        this.weightedCapacity = $.weightedCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GameServerGroupInstanceDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerGroupInstanceDefinitionArgs $;

        public Builder() {
            $ = new GameServerGroupInstanceDefinitionArgs();
        }

        public Builder(GameServerGroupInstanceDefinitionArgs defaults) {
            $ = new GameServerGroupInstanceDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceType An EC2 instance type.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType An EC2 instance type.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param weightedCapacity Instance weighting that indicates how much this instance type contributes
         * to the total capacity of a game server group.
         * Instance weights are used by GameLift FleetIQ to calculate the instance type&#39;s cost per unit hour and better identify
         * the most cost-effective options.
         * 
         * @return builder
         * 
         */
        public Builder weightedCapacity(@Nullable Output<String> weightedCapacity) {
            $.weightedCapacity = weightedCapacity;
            return this;
        }

        /**
         * @param weightedCapacity Instance weighting that indicates how much this instance type contributes
         * to the total capacity of a game server group.
         * Instance weights are used by GameLift FleetIQ to calculate the instance type&#39;s cost per unit hour and better identify
         * the most cost-effective options.
         * 
         * @return builder
         * 
         */
        public Builder weightedCapacity(String weightedCapacity) {
            return weightedCapacity(Output.of(weightedCapacity));
        }

        public GameServerGroupInstanceDefinitionArgs build() {
            $.instanceType = Objects.requireNonNull($.instanceType, "expected parameter 'instanceType' to be non-null");
            return $;
        }
    }

}