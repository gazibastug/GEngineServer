// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GMMessage.proto

package info.xiaomo.server.shared.protocol.gm;

/** Protobuf type {@code ResGMCloseServer} */
public final class ResGMCloseServer extends com.google.protobuf.GeneratedMessageV3
        implements
        // @@protoc_insertion_point(message_implements:ResGMCloseServer)
        ResGMCloseServerOrBuilder {
    public static final int MSGID_FIELD_NUMBER = 1;
    public static final int RESMSG_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:ResGMCloseServer)
    private static final ResGMCloseServer DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<ResGMCloseServer> PARSER =
            new com.google.protobuf.AbstractParser<ResGMCloseServer>() {
                @Override
                public ResGMCloseServer parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new ResGMCloseServer(input, extensionRegistry);
                }
            };

    static {
        DEFAULT_INSTANCE = new ResGMCloseServer();
    }

    private int msgId_;
    private volatile Object resMsg_;
    private byte memoizedIsInitialized = -1;
    // Use ResGMCloseServer.newBuilder() to construct.
    private ResGMCloseServer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }
    private ResGMCloseServer() {
        msgId_ = 0;
        resMsg_ = "";
    }
    private ResGMCloseServer(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    case 8:
                        {
                            int rawValue = input.readEnum();

                            msgId_ = rawValue;
                            break;
                        }
                    case 18:
                        {
                            String s = input.readStringRequireUtf8();

                            resMsg_ = s;
                            break;
                        }
                    default:
                        {
                            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(this);
        } finally {
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return GMMessage.internal_static_ResGMCloseServer_descriptor;
    }

    public static ResGMCloseServer parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ResGMCloseServer parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ResGMCloseServer parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ResGMCloseServer parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ResGMCloseServer parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ResGMCloseServer parseFrom(
            byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ResGMCloseServer parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ResGMCloseServer parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                PARSER, input, extensionRegistry);
    }

    public static ResGMCloseServer parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static ResGMCloseServer parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                PARSER, input, extensionRegistry);
    }

    public static ResGMCloseServer parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ResGMCloseServer parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ResGMCloseServer prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static ResGMCloseServer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<ResGMCloseServer> parser() {
        return PARSER;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(UnusedPrivateParameter unused) {
        return new ResGMCloseServer();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override
    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return GMMessage.internal_static_ResGMCloseServer_fieldAccessorTable
                .ensureFieldAccessorsInitialized(ResGMCloseServer.class, Builder.class);
    }

    /**
     * <code>.GMMsgId msgId = 1;</code>
     *
     * @return The enum numeric value on the wire for msgId.
     */
    @Override
    public int getMsgIdValue() {
        return msgId_;
    }

    /**
     * <code>.GMMsgId msgId = 1;</code>
     *
     * @return The msgId.
     */
    @Override
    public info.xiaomo.server.shared.protocol.msg.GMMsgId getMsgId() {
        @SuppressWarnings("deprecation")
        info.xiaomo.server.shared.protocol.msg.GMMsgId result =
                info.xiaomo.server.shared.protocol.msg.GMMsgId.valueOf(msgId_);
        return result == null
                ? info.xiaomo.server.shared.protocol.msg.GMMsgId.UNRECOGNIZED
                : result;
    }

    /**
     * <code>string resMsg = 2;</code>
     *
     * @return The resMsg.
     */
    @Override
    public String getResMsg() {
        Object ref = resMsg_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            resMsg_ = s;
            return s;
        }
    }

    /**
     * <code>string resMsg = 2;</code>
     *
     * @return The bytes for resMsg.
     */
    @Override
    public com.google.protobuf.ByteString getResMsgBytes() {
        Object ref = resMsg_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8((String) ref);
            resMsg_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    @Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        if (msgId_ != info.xiaomo.server.shared.protocol.msg.GMMsgId.UNKNOWN.getNumber()) {
            output.writeEnum(1, msgId_);
        }
        if (!getResMsgBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resMsg_);
        }
        unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (msgId_ != info.xiaomo.server.shared.protocol.msg.GMMsgId.UNKNOWN.getNumber()) {
            size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, msgId_);
        }
        if (!getResMsgBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resMsg_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResGMCloseServer)) {
            return super.equals(obj);
        }
        ResGMCloseServer other = (ResGMCloseServer) obj;

        if (msgId_ != other.msgId_) return false;
        if (!getResMsg().equals(other.getResMsg())) return false;
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + MSGID_FIELD_NUMBER;
        hash = (53 * hash) + msgId_;
        hash = (37 * hash) + RESMSG_FIELD_NUMBER;
        hash = (53 * hash) + getResMsg().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    @Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    @Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    @Override
    public com.google.protobuf.Parser<ResGMCloseServer> getParserForType() {
        return PARSER;
    }

    @Override
    public ResGMCloseServer getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /** Protobuf type {@code ResGMCloseServer} */
    public static final class Builder
            extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:ResGMCloseServer)
            ResGMCloseServerOrBuilder {
        private int msgId_ = 0;
        private Object resMsg_ = "";

        // Construct using info.xiaomo.server.shared.protocol.gm.ResGMCloseServer.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return GMMessage.internal_static_ResGMCloseServer_descriptor;
        }

        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GMMessage.internal_static_ResGMCloseServer_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(ResGMCloseServer.class, Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
        }

        @Override
        public Builder clear() {
            super.clear();
            msgId_ = 0;

            resMsg_ = "";

            return this;
        }

        @Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return GMMessage.internal_static_ResGMCloseServer_descriptor;
        }

        @Override
        public ResGMCloseServer getDefaultInstanceForType() {
            return ResGMCloseServer.getDefaultInstance();
        }

        @Override
        public ResGMCloseServer build() {
            ResGMCloseServer result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @Override
        public ResGMCloseServer buildPartial() {
            ResGMCloseServer result = new ResGMCloseServer(this);
            result.msgId_ = msgId_;
            result.resMsg_ = resMsg_;
            onBuilt();
            return result;
        }

        @Override
        public Builder clone() {
            return super.clone();
        }

        @Override
        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
            return super.setField(field, value);
        }

        @Override
        public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        @Override
        public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        @Override
        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @Override
        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
            return super.addRepeatedField(field, value);
        }

        @Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof ResGMCloseServer) {
                return mergeFrom((ResGMCloseServer) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(ResGMCloseServer other) {
            if (other == ResGMCloseServer.getDefaultInstance()) return this;
            if (other.msgId_ != 0) {
                setMsgIdValue(other.getMsgIdValue());
            }
            if (!other.getResMsg().isEmpty()) {
                resMsg_ = other.resMsg_;
                onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        @Override
        public final boolean isInitialized() {
            return true;
        }

        @Override
        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            ResGMCloseServer parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (ResGMCloseServer) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        /**
         * <code>.GMMsgId msgId = 1;</code>
         *
         * @return The enum numeric value on the wire for msgId.
         */
        @Override
        public int getMsgIdValue() {
            return msgId_;
        }

        /**
         * <code>.GMMsgId msgId = 1;</code>
         *
         * @param value The enum numeric value on the wire for msgId to set.
         * @return This builder for chaining.
         */
        public Builder setMsgIdValue(int value) {

            msgId_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>.GMMsgId msgId = 1;</code>
         *
         * @return The msgId.
         */
        @Override
        public info.xiaomo.server.shared.protocol.msg.GMMsgId getMsgId() {
            @SuppressWarnings("deprecation")
            info.xiaomo.server.shared.protocol.msg.GMMsgId result =
                    info.xiaomo.server.shared.protocol.msg.GMMsgId.valueOf(msgId_);
            return result == null
                    ? info.xiaomo.server.shared.protocol.msg.GMMsgId.UNRECOGNIZED
                    : result;
        }

        /**
         * <code>.GMMsgId msgId = 1;</code>
         *
         * @param value The msgId to set.
         * @return This builder for chaining.
         */
        public Builder setMsgId(info.xiaomo.server.shared.protocol.msg.GMMsgId value) {
            if (value == null) {
                throw new NullPointerException();
            }

            msgId_ = value.getNumber();
            onChanged();
            return this;
        }

        /**
         * <code>.GMMsgId msgId = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearMsgId() {

            msgId_ = 0;
            onChanged();
            return this;
        }

        /**
         * <code>string resMsg = 2;</code>
         *
         * @return The resMsg.
         */
        public String getResMsg() {
            Object ref = resMsg_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                resMsg_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>string resMsg = 2;</code>
         *
         * @param value The resMsg to set.
         * @return This builder for chaining.
         */
        public Builder setResMsg(String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            resMsg_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string resMsg = 2;</code>
         *
         * @return The bytes for resMsg.
         */
        public com.google.protobuf.ByteString getResMsgBytes() {
            Object ref = resMsg_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                resMsg_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string resMsg = 2;</code>
         *
         * @param value The bytes for resMsg to set.
         * @return This builder for chaining.
         */
        public Builder setResMsgBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            resMsg_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string resMsg = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearResMsg() {

            resMsg_ = getDefaultInstance().getResMsg();
            onChanged();
            return this;
        }

        @Override
        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @Override
        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }

        // @@protoc_insertion_point(builder_scope:ResGMCloseServer)
    }
}
