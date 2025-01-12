// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeGuruReviewer.Inputs
{

    public sealed class RepositoryAssociationS3RepositoryDetailArgs : global::Pulumi.ResourceArgs
    {
        [Input("bucketName")]
        public Input<string>? BucketName { get; set; }

        [Input("codeArtifacts")]
        private InputList<Inputs.RepositoryAssociationS3RepositoryDetailCodeArtifactArgs>? _codeArtifacts;
        public InputList<Inputs.RepositoryAssociationS3RepositoryDetailCodeArtifactArgs> CodeArtifacts
        {
            get => _codeArtifacts ?? (_codeArtifacts = new InputList<Inputs.RepositoryAssociationS3RepositoryDetailCodeArtifactArgs>());
            set => _codeArtifacts = value;
        }

        public RepositoryAssociationS3RepositoryDetailArgs()
        {
        }
        public static new RepositoryAssociationS3RepositoryDetailArgs Empty => new RepositoryAssociationS3RepositoryDetailArgs();
    }
}
