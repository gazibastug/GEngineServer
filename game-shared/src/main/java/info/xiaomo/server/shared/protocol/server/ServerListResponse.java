// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerMessage.proto

package info.xiaomo.server.shared.protocol.server;

/**
 * <pre>
 *服务器列表
 * </pre>
 *
 * Protobuf type {@code ServerListResponse}
 */
public final class ServerListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServerListResponse)
    ServerListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServerListResponse.newBuilder() to construct.
  private ServerListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerListResponse() {
    msgId_ = 0;
    serverInfo_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServerListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServerListResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8: {
            int rawValue = input.readEnum();

            msgId_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              serverInfo_ = new java.util.ArrayList<info.xiaomo.server.shared.protocol.server.GameServerInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            serverInfo_.add(
                input.readMessage(info.xiaomo.server.shared.protocol.server.GameServerInfo.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        serverInfo_ = java.util.Collections.unmodifiableList(serverInfo_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.server.ServerMessage.internal_static_ServerListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.server.ServerMessage.internal_static_ServerListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.server.ServerListResponse.class, info.xiaomo.server.shared.protocol.server.ServerListResponse.Builder.class);
  }

  public static final int MSGID_FIELD_NUMBER = 1;
  private int msgId_;
  /**
   * <code>.MsgId msgId = 1;</code>
   * @return The enum numeric value on the wire for msgId.
   */
  @java.lang.Override public int getMsgIdValue() {
    return msgId_;
  }
  /**
   * <code>.MsgId msgId = 1;</code>
   * @return The msgId.
   */
  @java.lang.Override public info.xiaomo.server.shared.protocol.msg.MsgId getMsgId() {
    @SuppressWarnings("deprecation")
    info.xiaomo.server.shared.protocol.msg.MsgId result = info.xiaomo.server.shared.protocol.msg.MsgId.valueOf(msgId_);
    return result == null ? info.xiaomo.server.shared.protocol.msg.MsgId.UNRECOGNIZED : result;
  }

  public static final int SERVERINFO_FIELD_NUMBER = 2;
  private java.util.List<info.xiaomo.server.shared.protocol.server.GameServerInfo> serverInfo_;
  /**
   * <pre>
   *服务器信息
   * </pre>
   *
   * <code>repeated .GameServerInfo serverInfo = 2;</code>
   */
  @java.lang.Override
  public java.util.List<info.xiaomo.server.shared.protocol.server.GameServerInfo> getServerInfoList() {
    return serverInfo_;
  }
  /**
   * <pre>
   *服务器信息
   * </pre>
   *
   * <code>repeated .GameServerInfo serverInfo = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends info.xiaomo.server.shared.protocol.server.GameServerInfoOrBuilder> 
      getServerInfoOrBuilderList() {
    return serverInfo_;
  }
  /**
   * <pre>
   *服务器信息
   * </pre>
   *
   * <code>repeated .GameServerInfo serverInfo = 2;</code>
   */
  @java.lang.Override
  public int getServerInfoCount() {
    return serverInfo_.size();
  }
  /**
   * <pre>
   *服务器信息
   * </pre>
   *
   * <code>repeated .GameServerInfo serverInfo = 2;</code>
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.server.GameServerInfo getServerInfo(int index) {
    return serverInfo_.get(index);
  }
  /**
   * <pre>
   *服务器信息
   * </pre>
   *
   * <code>repeated .GameServerInfo serverInfo = 2;</code>
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.server.GameServerInfoOrBuilder getServerInfoOrBuilder(
      int index) {
    return serverInfo_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (msgId_ != info.xiaomo.server.shared.protocol.msg.MsgId.Base.getNumber()) {
      output.writeEnum(1, msgId_);
    }
    for (int i = 0; i < serverInfo_.size(); i++) {
      output.writeMessage(2, serverInfo_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (msgId_ != info.xiaomo.server.shared.protocol.msg.MsgId.Base.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, msgId_);
    }
    for (int i = 0; i < serverInfo_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, serverInfo_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof info.xiaomo.server.shared.protocol.server.ServerListResponse)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.server.ServerListResponse other = (info.xiaomo.server.shared.protocol.server.ServerListResponse) obj;

    if (msgId_ != other.msgId_) return false;
    if (!getServerInfoList()
        .equals(other.getServerInfoList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MSGID_FIELD_NUMBER;
    hash = (53 * hash) + msgId_;
    if (getServerInfoCount() > 0) {
      hash = (37 * hash) + SERVERINFO_FIELD_NUMBER;
      hash = (53 * hash) + getServerInfoList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.server.ServerListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerListResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.server.ServerListResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *服务器列表
   * </pre>
   *
   * Protobuf type {@code ServerListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServerListResponse)
      info.xiaomo.server.shared.protocol.server.ServerListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.server.ServerMessage.internal_static_ServerListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.server.ServerMessage.internal_static_ServerListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.server.ServerListResponse.class, info.xiaomo.server.shared.protocol.server.ServerListResponse.Builder.class);
    }

    // Construct using info.xiaomo.handler.shared.protocol.handler.ServerListResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getServerInfoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      msgId_ = 0;

      if (serverInfoBuilder_ == null) {
        serverInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        serverInfoBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.server.ServerMessage.internal_static_ServerListResponse_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.server.ServerListResponse getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.server.ServerListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.server.ServerListResponse build() {
      info.xiaomo.server.shared.protocol.server.ServerListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.server.ServerListResponse buildPartial() {
      info.xiaomo.server.shared.protocol.server.ServerListResponse result = new info.xiaomo.server.shared.protocol.server.ServerListResponse(this);
      int from_bitField0_ = bitField0_;
      result.msgId_ = msgId_;
      if (serverInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          serverInfo_ = java.util.Collections.unmodifiableList(serverInfo_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.serverInfo_ = serverInfo_;
      } else {
        result.serverInfo_ = serverInfoBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof info.xiaomo.server.shared.protocol.server.ServerListResponse) {
        return mergeFrom((info.xiaomo.server.shared.protocol.server.ServerListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.server.ServerListResponse other) {
      if (other == info.xiaomo.server.shared.protocol.server.ServerListResponse.getDefaultInstance()) return this;
      if (other.msgId_ != 0) {
        setMsgIdValue(other.getMsgIdValue());
      }
      if (serverInfoBuilder_ == null) {
        if (!other.serverInfo_.isEmpty()) {
          if (serverInfo_.isEmpty()) {
            serverInfo_ = other.serverInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServerInfoIsMutable();
            serverInfo_.addAll(other.serverInfo_);
          }
          onChanged();
        }
      } else {
        if (!other.serverInfo_.isEmpty()) {
          if (serverInfoBuilder_.isEmpty()) {
            serverInfoBuilder_.dispose();
            serverInfoBuilder_ = null;
            serverInfo_ = other.serverInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
            serverInfoBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getServerInfoFieldBuilder() : null;
          } else {
            serverInfoBuilder_.addAllMessages(other.serverInfo_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      info.xiaomo.server.shared.protocol.server.ServerListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.server.ServerListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int msgId_ = 0;
    /**
     * <code>.MsgId msgId = 1;</code>
     * @return The enum numeric value on the wire for msgId.
     */
    @java.lang.Override public int getMsgIdValue() {
      return msgId_;
    }
    /**
     * <code>.MsgId msgId = 1;</code>
     * @param value The enum numeric value on the wire for msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgIdValue(int value) {
      
      msgId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.MsgId msgId = 1;</code>
     * @return The msgId.
     */
    @java.lang.Override
    public info.xiaomo.server.shared.protocol.msg.MsgId getMsgId() {
      @SuppressWarnings("deprecation")
      info.xiaomo.server.shared.protocol.msg.MsgId result = info.xiaomo.server.shared.protocol.msg.MsgId.valueOf(msgId_);
      return result == null ? info.xiaomo.server.shared.protocol.msg.MsgId.UNRECOGNIZED : result;
    }
    /**
     * <code>.MsgId msgId = 1;</code>
     * @param value The msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgId(info.xiaomo.server.shared.protocol.msg.MsgId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      msgId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.MsgId msgId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgId() {
      
      msgId_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<info.xiaomo.server.shared.protocol.server.GameServerInfo> serverInfo_ =
      java.util.Collections.emptyList();
    private void ensureServerInfoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        serverInfo_ = new java.util.ArrayList<info.xiaomo.server.shared.protocol.server.GameServerInfo>(serverInfo_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        info.xiaomo.server.shared.protocol.server.GameServerInfo, info.xiaomo.server.shared.protocol.server.GameServerInfo.Builder, info.xiaomo.server.shared.protocol.server.GameServerInfoOrBuilder> serverInfoBuilder_;

    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public java.util.List<info.xiaomo.server.shared.protocol.server.GameServerInfo> getServerInfoList() {
      if (serverInfoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(serverInfo_);
      } else {
        return serverInfoBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public int getServerInfoCount() {
      if (serverInfoBuilder_ == null) {
        return serverInfo_.size();
      } else {
        return serverInfoBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.server.GameServerInfo getServerInfo(int index) {
      if (serverInfoBuilder_ == null) {
        return serverInfo_.get(index);
      } else {
        return serverInfoBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public Builder setServerInfo(
        int index, info.xiaomo.server.shared.protocol.server.GameServerInfo value) {
      if (serverInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServerInfoIsMutable();
        serverInfo_.set(index, value);
        onChanged();
      } else {
        serverInfoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public Builder setServerInfo(
        int index, info.xiaomo.server.shared.protocol.server.GameServerInfo.Builder builderForValue) {
      if (serverInfoBuilder_ == null) {
        ensureServerInfoIsMutable();
        serverInfo_.set(index, builderForValue.build());
        onChanged();
      } else {
        serverInfoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public Builder addServerInfo(info.xiaomo.server.shared.protocol.server.GameServerInfo value) {
      if (serverInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServerInfoIsMutable();
        serverInfo_.add(value);
        onChanged();
      } else {
        serverInfoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public Builder addServerInfo(
        int index, info.xiaomo.server.shared.protocol.server.GameServerInfo value) {
      if (serverInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServerInfoIsMutable();
        serverInfo_.add(index, value);
        onChanged();
      } else {
        serverInfoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public Builder addServerInfo(
        info.xiaomo.server.shared.protocol.server.GameServerInfo.Builder builderForValue) {
      if (serverInfoBuilder_ == null) {
        ensureServerInfoIsMutable();
        serverInfo_.add(builderForValue.build());
        onChanged();
      } else {
        serverInfoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public Builder addServerInfo(
        int index, info.xiaomo.server.shared.protocol.server.GameServerInfo.Builder builderForValue) {
      if (serverInfoBuilder_ == null) {
        ensureServerInfoIsMutable();
        serverInfo_.add(index, builderForValue.build());
        onChanged();
      } else {
        serverInfoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public Builder addAllServerInfo(
        java.lang.Iterable<? extends info.xiaomo.server.shared.protocol.server.GameServerInfo> values) {
      if (serverInfoBuilder_ == null) {
        ensureServerInfoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, serverInfo_);
        onChanged();
      } else {
        serverInfoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public Builder clearServerInfo() {
      if (serverInfoBuilder_ == null) {
        serverInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        serverInfoBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public Builder removeServerInfo(int index) {
      if (serverInfoBuilder_ == null) {
        ensureServerInfoIsMutable();
        serverInfo_.remove(index);
        onChanged();
      } else {
        serverInfoBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.server.GameServerInfo.Builder getServerInfoBuilder(
        int index) {
      return getServerInfoFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.server.GameServerInfoOrBuilder getServerInfoOrBuilder(
        int index) {
      if (serverInfoBuilder_ == null) {
        return serverInfo_.get(index);  } else {
        return serverInfoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public java.util.List<? extends info.xiaomo.server.shared.protocol.server.GameServerInfoOrBuilder> 
         getServerInfoOrBuilderList() {
      if (serverInfoBuilder_ != null) {
        return serverInfoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(serverInfo_);
      }
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.server.GameServerInfo.Builder addServerInfoBuilder() {
      return getServerInfoFieldBuilder().addBuilder(
          info.xiaomo.server.shared.protocol.server.GameServerInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.server.GameServerInfo.Builder addServerInfoBuilder(
        int index) {
      return getServerInfoFieldBuilder().addBuilder(
          index, info.xiaomo.server.shared.protocol.server.GameServerInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *服务器信息
     * </pre>
     *
     * <code>repeated .GameServerInfo serverInfo = 2;</code>
     */
    public java.util.List<info.xiaomo.server.shared.protocol.server.GameServerInfo.Builder> 
         getServerInfoBuilderList() {
      return getServerInfoFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        info.xiaomo.server.shared.protocol.server.GameServerInfo, info.xiaomo.server.shared.protocol.server.GameServerInfo.Builder, info.xiaomo.server.shared.protocol.server.GameServerInfoOrBuilder> 
        getServerInfoFieldBuilder() {
      if (serverInfoBuilder_ == null) {
        serverInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            info.xiaomo.server.shared.protocol.server.GameServerInfo, info.xiaomo.server.shared.protocol.server.GameServerInfo.Builder, info.xiaomo.server.shared.protocol.server.GameServerInfoOrBuilder>(
                serverInfo_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        serverInfo_ = null;
      }
      return serverInfoBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ServerListResponse)
  }

  // @@protoc_insertion_point(class_scope:ServerListResponse)
  private static final info.xiaomo.server.shared.protocol.server.ServerListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.server.ServerListResponse();
  }

  public static info.xiaomo.server.shared.protocol.server.ServerListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerListResponse>
      PARSER = new com.google.protobuf.AbstractParser<ServerListResponse>() {
    @java.lang.Override
    public ServerListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServerListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServerListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.server.ServerListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
