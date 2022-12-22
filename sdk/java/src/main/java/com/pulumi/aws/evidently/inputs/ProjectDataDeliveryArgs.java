// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.evidently.inputs;

import com.pulumi.aws.evidently.inputs.ProjectDataDeliveryCloudwatchLogsArgs;
import com.pulumi.aws.evidently.inputs.ProjectDataDeliveryS3DestinationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectDataDeliveryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectDataDeliveryArgs Empty = new ProjectDataDeliveryArgs();

    /**
     * A block that defines the CloudWatch Log Group that stores the evaluation events. See below.
     * 
     */
    @Import(name="cloudwatchLogs")
    private @Nullable Output<ProjectDataDeliveryCloudwatchLogsArgs> cloudwatchLogs;

    /**
     * @return A block that defines the CloudWatch Log Group that stores the evaluation events. See below.
     * 
     */
    public Optional<Output<ProjectDataDeliveryCloudwatchLogsArgs>> cloudwatchLogs() {
        return Optional.ofNullable(this.cloudwatchLogs);
    }

    /**
     * A block that defines the S3 bucket and prefix that stores the evaluation events. See below.
     * 
     */
    @Import(name="s3Destination")
    private @Nullable Output<ProjectDataDeliveryS3DestinationArgs> s3Destination;

    /**
     * @return A block that defines the S3 bucket and prefix that stores the evaluation events. See below.
     * 
     */
    public Optional<Output<ProjectDataDeliveryS3DestinationArgs>> s3Destination() {
        return Optional.ofNullable(this.s3Destination);
    }

    private ProjectDataDeliveryArgs() {}

    private ProjectDataDeliveryArgs(ProjectDataDeliveryArgs $) {
        this.cloudwatchLogs = $.cloudwatchLogs;
        this.s3Destination = $.s3Destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectDataDeliveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectDataDeliveryArgs $;

        public Builder() {
            $ = new ProjectDataDeliveryArgs();
        }

        public Builder(ProjectDataDeliveryArgs defaults) {
            $ = new ProjectDataDeliveryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudwatchLogs A block that defines the CloudWatch Log Group that stores the evaluation events. See below.
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchLogs(@Nullable Output<ProjectDataDeliveryCloudwatchLogsArgs> cloudwatchLogs) {
            $.cloudwatchLogs = cloudwatchLogs;
            return this;
        }

        /**
         * @param cloudwatchLogs A block that defines the CloudWatch Log Group that stores the evaluation events. See below.
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchLogs(ProjectDataDeliveryCloudwatchLogsArgs cloudwatchLogs) {
            return cloudwatchLogs(Output.of(cloudwatchLogs));
        }

        /**
         * @param s3Destination A block that defines the S3 bucket and prefix that stores the evaluation events. See below.
         * 
         * @return builder
         * 
         */
        public Builder s3Destination(@Nullable Output<ProjectDataDeliveryS3DestinationArgs> s3Destination) {
            $.s3Destination = s3Destination;
            return this;
        }

        /**
         * @param s3Destination A block that defines the S3 bucket and prefix that stores the evaluation events. See below.
         * 
         * @return builder
         * 
         */
        public Builder s3Destination(ProjectDataDeliveryS3DestinationArgs s3Destination) {
            return s3Destination(Output.of(s3Destination));
        }

        public ProjectDataDeliveryArgs build() {
            return $;
        }
    }

}