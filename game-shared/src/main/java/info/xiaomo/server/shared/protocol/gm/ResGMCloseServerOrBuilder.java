// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GMMessage.proto

package info.xiaomo.server.shared.protocol.gm;

public interface ResGMCloseServerOrBuilder
        extends
        // @@protoc_insertion_point(interface_extends:ResGMCloseServer)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GMMsgId msgId = 1;</code>
     *
     * @return The enum numeric value on the wire for msgId.
     */
    int getMsgIdValue();
    /**
     * <code>.GMMsgId msgId = 1;</code>
     *
     * @return The msgId.
     */
    info.xiaomo.server.shared.protocol.msg.GMMsgId getMsgId();

    /**
     * <code>string resMsg = 2;</code>
     *
     * @return The resMsg.
     */
    String getResMsg();
    /**
     * <code>string resMsg = 2;</code>
     *
     * @return The bytes for resMsg.
     */
    com.google.protobuf.ByteString getResMsgBytes();
}
