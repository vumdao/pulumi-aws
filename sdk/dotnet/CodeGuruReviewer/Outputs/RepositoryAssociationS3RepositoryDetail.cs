// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeGuruReviewer.Outputs
{

    [OutputType]
    public sealed class RepositoryAssociationS3RepositoryDetail
    {
        public readonly string? BucketName;
        public readonly ImmutableArray<Outputs.RepositoryAssociationS3RepositoryDetailCodeArtifact> CodeArtifacts;

        [OutputConstructor]
        private RepositoryAssociationS3RepositoryDetail(
            string? bucketName,

            ImmutableArray<Outputs.RepositoryAssociationS3RepositoryDetailCodeArtifact> codeArtifacts)
        {
            BucketName = bucketName;
            CodeArtifacts = codeArtifacts;
        }
    }
}
