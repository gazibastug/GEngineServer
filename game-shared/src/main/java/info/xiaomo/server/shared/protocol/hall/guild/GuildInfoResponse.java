// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallGuildMessage.proto

package info.xiaomo.server.shared.protocol.hall.guild;

/**
 * <pre>
 *获取帮会详细信息
 * </pre>
 *
 * Protobuf type {@code GuildInfoResponse}
 */
public final class GuildInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GuildInfoResponse)
    GuildInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GuildInfoResponse.newBuilder() to construct.
  private GuildInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GuildInfoResponse() {
    msgId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GuildInfoResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GuildInfoResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
          case 8: {
            int rawValue = input.readEnum();

            msgId_ = rawValue;
            break;
          }
          case 18: {
            info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder subBuilder = null;
            if (guildInfo_ != null) {
              subBuilder = guildInfo_.toBuilder();
            }
            guildInfo_ = input.readMessage(info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(guildInfo_);
              guildInfo_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse.class, info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse.Builder.class);
  }

  public static final int MSGID_FIELD_NUMBER = 1;
  private int msgId_;
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>.MsgId msgId = 1;</code>
   * @return The enum numeric value on the wire for msgId.
   */
  @java.lang.Override public int getMsgIdValue() {
    return msgId_;
  }
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>.MsgId msgId = 1;</code>
   * @return The msgId.
   */
  @java.lang.Override public info.xiaomo.server.shared.protocol.msg.MsgId getMsgId() {
    @SuppressWarnings("deprecation")
    info.xiaomo.server.shared.protocol.msg.MsgId result = info.xiaomo.server.shared.protocol.msg.MsgId.valueOf(msgId_);
    return result == null ? info.xiaomo.server.shared.protocol.msg.MsgId.UNRECOGNIZED : result;
  }

  public static final int GUILDINFO_FIELD_NUMBER = 2;
  private info.xiaomo.server.shared.protocol.hall.guild.GuildInfo guildInfo_;
  /**
   * <pre>
   *帮会信息
   * </pre>
   *
   * <code>.GuildInfo guildInfo = 2;</code>
   * @return Whether the guildInfo field is set.
   */
  @java.lang.Override
  public boolean hasGuildInfo() {
    return guildInfo_ != null;
  }
  /**
   * <pre>
   *帮会信息
   * </pre>
   *
   * <code>.GuildInfo guildInfo = 2;</code>
   * @return The guildInfo.
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.guild.GuildInfo getGuildInfo() {
    return guildInfo_ == null ? info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.getDefaultInstance() : guildInfo_;
  }
  /**
   * <pre>
   *帮会信息
   * </pre>
   *
   * <code>.GuildInfo guildInfo = 2;</code>
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder getGuildInfoOrBuilder() {
    return getGuildInfo();
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
    if (guildInfo_ != null) {
      output.writeMessage(2, getGuildInfo());
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
    if (guildInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGuildInfo());
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse other = (info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse) obj;

    if (msgId_ != other.msgId_) return false;
    if (hasGuildInfo() != other.hasGuildInfo()) return false;
    if (hasGuildInfo()) {
      if (!getGuildInfo()
          .equals(other.getGuildInfo())) return false;
    }
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
    if (hasGuildInfo()) {
      hash = (37 * hash) + GUILDINFO_FIELD_NUMBER;
      hash = (53 * hash) + getGuildInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse parseFrom(
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
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse prototype) {
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
   *获取帮会详细信息
   * </pre>
   *
   * Protobuf type {@code GuildInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GuildInfoResponse)
      info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse.class, info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse.Builder.class);
    }

    // Construct using info.xiaomo.handler.shared.protocol.hall.guild.GuildInfoResponse.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      msgId_ = 0;

      if (guildInfoBuilder_ == null) {
        guildInfo_ = null;
      } else {
        guildInfo_ = null;
        guildInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildInfoResponse_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse build() {
      info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse buildPartial() {
      info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse result = new info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse(this);
      result.msgId_ = msgId_;
      if (guildInfoBuilder_ == null) {
        result.guildInfo_ = guildInfo_;
      } else {
        result.guildInfo_ = guildInfoBuilder_.build();
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
      if (other instanceof info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse) {
        return mergeFrom((info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse other) {
      if (other == info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse.getDefaultInstance()) return this;
      if (other.msgId_ != 0) {
        setMsgIdValue(other.getMsgIdValue());
      }
      if (other.hasGuildInfo()) {
        mergeGuildInfo(other.getGuildInfo());
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
      info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int msgId_ = 0;
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>.MsgId msgId = 1;</code>
     * @return The enum numeric value on the wire for msgId.
     */
    @java.lang.Override public int getMsgIdValue() {
      return msgId_;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
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
     * <pre>
     *消息id
     * </pre>
     *
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
     * <pre>
     *消息id
     * </pre>
     *
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
     * <pre>
     *消息id
     * </pre>
     *
     * <code>.MsgId msgId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgId() {
      
      msgId_ = 0;
      onChanged();
      return this;
    }

    private info.xiaomo.server.shared.protocol.hall.guild.GuildInfo guildInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        info.xiaomo.server.shared.protocol.hall.guild.GuildInfo, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder, info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder> guildInfoBuilder_;
    /**
     * <pre>
     *帮会信息
     * </pre>
     *
     * <code>.GuildInfo guildInfo = 2;</code>
     * @return Whether the guildInfo field is set.
     */
    public boolean hasGuildInfo() {
      return guildInfoBuilder_ != null || guildInfo_ != null;
    }
    /**
     * <pre>
     *帮会信息
     * </pre>
     *
     * <code>.GuildInfo guildInfo = 2;</code>
     * @return The guildInfo.
     */
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfo getGuildInfo() {
      if (guildInfoBuilder_ == null) {
        return guildInfo_ == null ? info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.getDefaultInstance() : guildInfo_;
      } else {
        return guildInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *帮会信息
     * </pre>
     *
     * <code>.GuildInfo guildInfo = 2;</code>
     */
    public Builder setGuildInfo(info.xiaomo.server.shared.protocol.hall.guild.GuildInfo value) {
      if (guildInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        guildInfo_ = value;
        onChanged();
      } else {
        guildInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *帮会信息
     * </pre>
     *
     * <code>.GuildInfo guildInfo = 2;</code>
     */
    public Builder setGuildInfo(
        info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder builderForValue) {
      if (guildInfoBuilder_ == null) {
        guildInfo_ = builderForValue.build();
        onChanged();
      } else {
        guildInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *帮会信息
     * </pre>
     *
     * <code>.GuildInfo guildInfo = 2;</code>
     */
    public Builder mergeGuildInfo(info.xiaomo.server.shared.protocol.hall.guild.GuildInfo value) {
      if (guildInfoBuilder_ == null) {
        if (guildInfo_ != null) {
          guildInfo_ =
            info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.newBuilder(guildInfo_).mergeFrom(value).buildPartial();
        } else {
          guildInfo_ = value;
        }
        onChanged();
      } else {
        guildInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *帮会信息
     * </pre>
     *
     * <code>.GuildInfo guildInfo = 2;</code>
     */
    public Builder clearGuildInfo() {
      if (guildInfoBuilder_ == null) {
        guildInfo_ = null;
        onChanged();
      } else {
        guildInfo_ = null;
        guildInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *帮会信息
     * </pre>
     *
     * <code>.GuildInfo guildInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder getGuildInfoBuilder() {
      
      onChanged();
      return getGuildInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *帮会信息
     * </pre>
     *
     * <code>.GuildInfo guildInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder getGuildInfoOrBuilder() {
      if (guildInfoBuilder_ != null) {
        return guildInfoBuilder_.getMessageOrBuilder();
      } else {
        return guildInfo_ == null ?
            info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.getDefaultInstance() : guildInfo_;
      }
    }
    /**
     * <pre>
     *帮会信息
     * </pre>
     *
     * <code>.GuildInfo guildInfo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        info.xiaomo.server.shared.protocol.hall.guild.GuildInfo, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder, info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder> 
        getGuildInfoFieldBuilder() {
      if (guildInfoBuilder_ == null) {
        guildInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            info.xiaomo.server.shared.protocol.hall.guild.GuildInfo, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder, info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder>(
                getGuildInfo(),
                getParentForChildren(),
                isClean());
        guildInfo_ = null;
      }
      return guildInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GuildInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:GuildInfoResponse)
  private static final info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse();
  }

  public static info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GuildInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<GuildInfoResponse>() {
    @java.lang.Override
    public GuildInfoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GuildInfoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GuildInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuildInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.guild.GuildInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
