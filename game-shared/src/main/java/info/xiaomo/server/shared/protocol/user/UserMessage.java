// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserMessage.proto

package info.xiaomo.server.shared.protocol.user;

public final class UserMessage {
    static final com.google.protobuf.Descriptors.Descriptor internal_static_ReqUserLogin_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ReqUserLogin_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor internal_static_ResUserLogin_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ResUserLogin_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        String[] descriptorData = {
            "\n\021UserMessage.proto\032\017MessageId.proto\"Y\n\014"
                    + "ReqUserLogin\022\031\n\005msgId\030\001 \001(\0162\n.UserMsgId\022"
                    + "\013\n\003sex\030\002 \001(\005\022\016\n\006userId\030\003 \001(\003\022\021\n\tloginNam"
                    + "e\030\004 \001(\t\"Y\n\014ResUserLogin\022\031\n\005msgId\030\001 \001(\0162\n"
                    + ".UserMsgId\022\013\n\003sex\030\002 \001(\005\022\016\n\006userId\030\003 \001(\003\022"
                    + "\021\n\tloginName\030\004 \001(\tB+\n\'info.xiaomo.server"
                    + ".shared.protocol.userP\001b\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            info.xiaomo.server.shared.protocol.msg.MessageId.getDescriptor(),
                        });
        internal_static_ReqUserLogin_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ReqUserLogin_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ReqUserLogin_descriptor,
                        new String[] {
                            "MsgId", "Sex", "UserId", "LoginName",
                        });
        internal_static_ResUserLogin_descriptor = getDescriptor().getMessageTypes().get(1);
        internal_static_ResUserLogin_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ResUserLogin_descriptor,
                        new String[] {
                            "MsgId", "Sex", "UserId", "LoginName",
                        });
        info.xiaomo.server.shared.protocol.msg.MessageId.getDescriptor();
    }
    private UserMessage() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    // @@protoc_insertion_point(outer_class_scope)
}
