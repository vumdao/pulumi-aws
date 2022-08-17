// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionPlacementConstraintArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionPlacementConstraintArgs Empty = new TaskDefinitionPlacementConstraintArgs();

    /**
     * Cluster Query Language expression to apply to the constraint. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
     * 
     */
    @Import(name="expression")
    private @Nullable Output<String> expression;

    /**
     * @return Cluster Query Language expression to apply to the constraint. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
     * 
     */
    public Optional<Output<String>> expression() {
        return Optional.ofNullable(this.expression);
    }

    /**
     * Proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private TaskDefinitionPlacementConstraintArgs() {}

    private TaskDefinitionPlacementConstraintArgs(TaskDefinitionPlacementConstraintArgs $) {
        this.expression = $.expression;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionPlacementConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionPlacementConstraintArgs $;

        public Builder() {
            $ = new TaskDefinitionPlacementConstraintArgs();
        }

        public Builder(TaskDefinitionPlacementConstraintArgs defaults) {
            $ = new TaskDefinitionPlacementConstraintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expression Cluster Query Language expression to apply to the constraint. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
         * 
         * @return builder
         * 
         */
        public Builder expression(@Nullable Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Cluster Query Language expression to apply to the constraint. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param type Proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TaskDefinitionPlacementConstraintArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}