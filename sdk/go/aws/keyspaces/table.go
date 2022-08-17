// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package keyspaces

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Keyspaces Table.
//
// More information about Keyspaces tables can be found in the [Keyspaces Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/working-with-tables.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/keyspaces"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := keyspaces.NewTable(ctx, "example", &keyspaces.TableArgs{
//				KeyspaceName: pulumi.Any(aws_keyspaces_keyspace.Example.Name),
//				TableName:    pulumi.String("my_table"),
//				SchemaDefinition: &keyspaces.TableSchemaDefinitionArgs{
//					Columns: keyspaces.TableSchemaDefinitionColumnArray{
//						&keyspaces.TableSchemaDefinitionColumnArgs{
//							Name: pulumi.String("Message"),
//							Type: pulumi.String("ASCII"),
//						},
//					},
//					PartitionKeys: keyspaces.TableSchemaDefinitionPartitionKeyArray{
//						&keyspaces.TableSchemaDefinitionPartitionKeyArgs{
//							Name: pulumi.String("Message"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Use the `keyspace_name` and `table_name` separated by `/` to import a table. For example
//
// ```sh
//
//	$ pulumi import aws:keyspaces/table:Table example my_keyspace/my_table
//
// ```
type Table struct {
	pulumi.CustomResourceState

	// The ARN of the table.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Specifies the read/write throughput capacity mode for the table.
	CapacitySpecification TableCapacitySpecificationOutput `pulumi:"capacitySpecification"`
	// A description of the table.
	Comment TableCommentOutput `pulumi:"comment"`
	// The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
	DefaultTimeToLive pulumi.IntPtrOutput `pulumi:"defaultTimeToLive"`
	// Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
	EncryptionSpecification TableEncryptionSpecificationOutput `pulumi:"encryptionSpecification"`
	// The name of the keyspace that the table is going to be created in.
	KeyspaceName pulumi.StringOutput `pulumi:"keyspaceName"`
	// Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
	PointInTimeRecovery TablePointInTimeRecoveryOutput `pulumi:"pointInTimeRecovery"`
	// Describes the schema of the table.
	SchemaDefinition TableSchemaDefinitionOutput `pulumi:"schemaDefinition"`
	// The name of the table.
	TableName pulumi.StringOutput `pulumi:"tableName"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    pulumi.StringMapOutput `pulumi:"tags"`
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
	Ttl TableTtlPtrOutput `pulumi:"ttl"`
}

// NewTable registers a new resource with the given unique name, arguments, and options.
func NewTable(ctx *pulumi.Context,
	name string, args *TableArgs, opts ...pulumi.ResourceOption) (*Table, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KeyspaceName == nil {
		return nil, errors.New("invalid value for required argument 'KeyspaceName'")
	}
	if args.SchemaDefinition == nil {
		return nil, errors.New("invalid value for required argument 'SchemaDefinition'")
	}
	if args.TableName == nil {
		return nil, errors.New("invalid value for required argument 'TableName'")
	}
	var resource Table
	err := ctx.RegisterResource("aws:keyspaces/table:Table", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTable gets an existing Table resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TableState, opts ...pulumi.ResourceOption) (*Table, error) {
	var resource Table
	err := ctx.ReadResource("aws:keyspaces/table:Table", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Table resources.
type tableState struct {
	// The ARN of the table.
	Arn *string `pulumi:"arn"`
	// Specifies the read/write throughput capacity mode for the table.
	CapacitySpecification *TableCapacitySpecification `pulumi:"capacitySpecification"`
	// A description of the table.
	Comment *TableComment `pulumi:"comment"`
	// The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
	DefaultTimeToLive *int `pulumi:"defaultTimeToLive"`
	// Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
	EncryptionSpecification *TableEncryptionSpecification `pulumi:"encryptionSpecification"`
	// The name of the keyspace that the table is going to be created in.
	KeyspaceName *string `pulumi:"keyspaceName"`
	// Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
	PointInTimeRecovery *TablePointInTimeRecovery `pulumi:"pointInTimeRecovery"`
	// Describes the schema of the table.
	SchemaDefinition *TableSchemaDefinition `pulumi:"schemaDefinition"`
	// The name of the table.
	TableName *string `pulumi:"tableName"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    map[string]string `pulumi:"tags"`
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
	Ttl *TableTtl `pulumi:"ttl"`
}

type TableState struct {
	// The ARN of the table.
	Arn pulumi.StringPtrInput
	// Specifies the read/write throughput capacity mode for the table.
	CapacitySpecification TableCapacitySpecificationPtrInput
	// A description of the table.
	Comment TableCommentPtrInput
	// The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
	DefaultTimeToLive pulumi.IntPtrInput
	// Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
	EncryptionSpecification TableEncryptionSpecificationPtrInput
	// The name of the keyspace that the table is going to be created in.
	KeyspaceName pulumi.StringPtrInput
	// Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
	PointInTimeRecovery TablePointInTimeRecoveryPtrInput
	// Describes the schema of the table.
	SchemaDefinition TableSchemaDefinitionPtrInput
	// The name of the table.
	TableName pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
	// Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
	Ttl TableTtlPtrInput
}

func (TableState) ElementType() reflect.Type {
	return reflect.TypeOf((*tableState)(nil)).Elem()
}

type tableArgs struct {
	// Specifies the read/write throughput capacity mode for the table.
	CapacitySpecification *TableCapacitySpecification `pulumi:"capacitySpecification"`
	// A description of the table.
	Comment *TableComment `pulumi:"comment"`
	// The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
	DefaultTimeToLive *int `pulumi:"defaultTimeToLive"`
	// Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
	EncryptionSpecification *TableEncryptionSpecification `pulumi:"encryptionSpecification"`
	// The name of the keyspace that the table is going to be created in.
	KeyspaceName string `pulumi:"keyspaceName"`
	// Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
	PointInTimeRecovery *TablePointInTimeRecovery `pulumi:"pointInTimeRecovery"`
	// Describes the schema of the table.
	SchemaDefinition TableSchemaDefinition `pulumi:"schemaDefinition"`
	// The name of the table.
	TableName string `pulumi:"tableName"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
	Ttl *TableTtl `pulumi:"ttl"`
}

// The set of arguments for constructing a Table resource.
type TableArgs struct {
	// Specifies the read/write throughput capacity mode for the table.
	CapacitySpecification TableCapacitySpecificationPtrInput
	// A description of the table.
	Comment TableCommentPtrInput
	// The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
	DefaultTimeToLive pulumi.IntPtrInput
	// Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
	EncryptionSpecification TableEncryptionSpecificationPtrInput
	// The name of the keyspace that the table is going to be created in.
	KeyspaceName pulumi.StringInput
	// Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
	PointInTimeRecovery TablePointInTimeRecoveryPtrInput
	// Describes the schema of the table.
	SchemaDefinition TableSchemaDefinitionInput
	// The name of the table.
	TableName pulumi.StringInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
	Ttl TableTtlPtrInput
}

func (TableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tableArgs)(nil)).Elem()
}

type TableInput interface {
	pulumi.Input

	ToTableOutput() TableOutput
	ToTableOutputWithContext(ctx context.Context) TableOutput
}

func (*Table) ElementType() reflect.Type {
	return reflect.TypeOf((**Table)(nil)).Elem()
}

func (i *Table) ToTableOutput() TableOutput {
	return i.ToTableOutputWithContext(context.Background())
}

func (i *Table) ToTableOutputWithContext(ctx context.Context) TableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableOutput)
}

// TableArrayInput is an input type that accepts TableArray and TableArrayOutput values.
// You can construct a concrete instance of `TableArrayInput` via:
//
//	TableArray{ TableArgs{...} }
type TableArrayInput interface {
	pulumi.Input

	ToTableArrayOutput() TableArrayOutput
	ToTableArrayOutputWithContext(context.Context) TableArrayOutput
}

type TableArray []TableInput

func (TableArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Table)(nil)).Elem()
}

func (i TableArray) ToTableArrayOutput() TableArrayOutput {
	return i.ToTableArrayOutputWithContext(context.Background())
}

func (i TableArray) ToTableArrayOutputWithContext(ctx context.Context) TableArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableArrayOutput)
}

// TableMapInput is an input type that accepts TableMap and TableMapOutput values.
// You can construct a concrete instance of `TableMapInput` via:
//
//	TableMap{ "key": TableArgs{...} }
type TableMapInput interface {
	pulumi.Input

	ToTableMapOutput() TableMapOutput
	ToTableMapOutputWithContext(context.Context) TableMapOutput
}

type TableMap map[string]TableInput

func (TableMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Table)(nil)).Elem()
}

func (i TableMap) ToTableMapOutput() TableMapOutput {
	return i.ToTableMapOutputWithContext(context.Background())
}

func (i TableMap) ToTableMapOutputWithContext(ctx context.Context) TableMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableMapOutput)
}

type TableOutput struct{ *pulumi.OutputState }

func (TableOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Table)(nil)).Elem()
}

func (o TableOutput) ToTableOutput() TableOutput {
	return o
}

func (o TableOutput) ToTableOutputWithContext(ctx context.Context) TableOutput {
	return o
}

// The ARN of the table.
func (o TableOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Specifies the read/write throughput capacity mode for the table.
func (o TableOutput) CapacitySpecification() TableCapacitySpecificationOutput {
	return o.ApplyT(func(v *Table) TableCapacitySpecificationOutput { return v.CapacitySpecification }).(TableCapacitySpecificationOutput)
}

// A description of the table.
func (o TableOutput) Comment() TableCommentOutput {
	return o.ApplyT(func(v *Table) TableCommentOutput { return v.Comment }).(TableCommentOutput)
}

// The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
func (o TableOutput) DefaultTimeToLive() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.IntPtrOutput { return v.DefaultTimeToLive }).(pulumi.IntPtrOutput)
}

// Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
func (o TableOutput) EncryptionSpecification() TableEncryptionSpecificationOutput {
	return o.ApplyT(func(v *Table) TableEncryptionSpecificationOutput { return v.EncryptionSpecification }).(TableEncryptionSpecificationOutput)
}

// The name of the keyspace that the table is going to be created in.
func (o TableOutput) KeyspaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.KeyspaceName }).(pulumi.StringOutput)
}

// Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
func (o TableOutput) PointInTimeRecovery() TablePointInTimeRecoveryOutput {
	return o.ApplyT(func(v *Table) TablePointInTimeRecoveryOutput { return v.PointInTimeRecovery }).(TablePointInTimeRecoveryOutput)
}

// Describes the schema of the table.
func (o TableOutput) SchemaDefinition() TableSchemaDefinitionOutput {
	return o.ApplyT(func(v *Table) TableSchemaDefinitionOutput { return v.SchemaDefinition }).(TableSchemaDefinitionOutput)
}

// The name of the table.
func (o TableOutput) TableName() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.TableName }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o TableOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Table) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

func (o TableOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Table) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
func (o TableOutput) Ttl() TableTtlPtrOutput {
	return o.ApplyT(func(v *Table) TableTtlPtrOutput { return v.Ttl }).(TableTtlPtrOutput)
}

type TableArrayOutput struct{ *pulumi.OutputState }

func (TableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Table)(nil)).Elem()
}

func (o TableArrayOutput) ToTableArrayOutput() TableArrayOutput {
	return o
}

func (o TableArrayOutput) ToTableArrayOutputWithContext(ctx context.Context) TableArrayOutput {
	return o
}

func (o TableArrayOutput) Index(i pulumi.IntInput) TableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Table {
		return vs[0].([]*Table)[vs[1].(int)]
	}).(TableOutput)
}

type TableMapOutput struct{ *pulumi.OutputState }

func (TableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Table)(nil)).Elem()
}

func (o TableMapOutput) ToTableMapOutput() TableMapOutput {
	return o
}

func (o TableMapOutput) ToTableMapOutputWithContext(ctx context.Context) TableMapOutput {
	return o
}

func (o TableMapOutput) MapIndex(k pulumi.StringInput) TableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Table {
		return vs[0].(map[string]*Table)[vs[1].(string)]
	}).(TableOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TableInput)(nil)).Elem(), &Table{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableArrayInput)(nil)).Elem(), TableArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableMapInput)(nil)).Elem(), TableMap{})
	pulumi.RegisterOutputType(TableOutput{})
	pulumi.RegisterOutputType(TableArrayOutput{})
	pulumi.RegisterOutputType(TableMapOutput{})
}