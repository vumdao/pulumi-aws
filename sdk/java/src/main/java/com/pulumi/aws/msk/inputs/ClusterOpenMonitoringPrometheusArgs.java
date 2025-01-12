// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusJmxExporterArgs;
import com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusNodeExporterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterOpenMonitoringPrometheusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterOpenMonitoringPrometheusArgs Empty = new ClusterOpenMonitoringPrometheusArgs();

    @Import(name="jmxExporter")
    private @Nullable Output<ClusterOpenMonitoringPrometheusJmxExporterArgs> jmxExporter;

    public Optional<Output<ClusterOpenMonitoringPrometheusJmxExporterArgs>> jmxExporter() {
        return Optional.ofNullable(this.jmxExporter);
    }

    @Import(name="nodeExporter")
    private @Nullable Output<ClusterOpenMonitoringPrometheusNodeExporterArgs> nodeExporter;

    public Optional<Output<ClusterOpenMonitoringPrometheusNodeExporterArgs>> nodeExporter() {
        return Optional.ofNullable(this.nodeExporter);
    }

    private ClusterOpenMonitoringPrometheusArgs() {}

    private ClusterOpenMonitoringPrometheusArgs(ClusterOpenMonitoringPrometheusArgs $) {
        this.jmxExporter = $.jmxExporter;
        this.nodeExporter = $.nodeExporter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterOpenMonitoringPrometheusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterOpenMonitoringPrometheusArgs $;

        public Builder() {
            $ = new ClusterOpenMonitoringPrometheusArgs();
        }

        public Builder(ClusterOpenMonitoringPrometheusArgs defaults) {
            $ = new ClusterOpenMonitoringPrometheusArgs(Objects.requireNonNull(defaults));
        }

        public Builder jmxExporter(@Nullable Output<ClusterOpenMonitoringPrometheusJmxExporterArgs> jmxExporter) {
            $.jmxExporter = jmxExporter;
            return this;
        }

        public Builder jmxExporter(ClusterOpenMonitoringPrometheusJmxExporterArgs jmxExporter) {
            return jmxExporter(Output.of(jmxExporter));
        }

        public Builder nodeExporter(@Nullable Output<ClusterOpenMonitoringPrometheusNodeExporterArgs> nodeExporter) {
            $.nodeExporter = nodeExporter;
            return this;
        }

        public Builder nodeExporter(ClusterOpenMonitoringPrometheusNodeExporterArgs nodeExporter) {
            return nodeExporter(Output.of(nodeExporter));
        }

        public ClusterOpenMonitoringPrometheusArgs build() {
            return $;
        }
    }

}
