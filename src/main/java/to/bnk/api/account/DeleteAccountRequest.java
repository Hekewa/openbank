// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.account;

/**
 * Protobuf type {@code accounts.DeleteAccountRequest}
 */
public  final class DeleteAccountRequest extends
    com.google.protobuf.GeneratedMessageLite<
        DeleteAccountRequest, DeleteAccountRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:accounts.DeleteAccountRequest)
    DeleteAccountRequestOrBuilder {
  private DeleteAccountRequest() {
    accountID_ = "";
  }
  public static final int ACCOUNTID_FIELD_NUMBER = 1;
  private java.lang.String accountID_;
  /**
   * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getAccountID() {
    return accountID_;
  }
  /**
   * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(accountID_);
  }
  /**
   * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAccountID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    accountID_ = value;
  }
  /**
   * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearAccountID() {
    
    accountID_ = getDefaultInstance().getAccountID();
  }
  /**
   * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAccountIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    accountID_ = value.toStringUtf8();
  }

  public static to.bnk.api.account.DeleteAccountRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.account.DeleteAccountRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.account.DeleteAccountRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.account.DeleteAccountRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.account.DeleteAccountRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.account.DeleteAccountRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.account.DeleteAccountRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.account.DeleteAccountRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.account.DeleteAccountRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.account.DeleteAccountRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.account.DeleteAccountRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.account.DeleteAccountRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.account.DeleteAccountRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code accounts.DeleteAccountRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.account.DeleteAccountRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:accounts.DeleteAccountRequest)
      to.bnk.api.account.DeleteAccountRequestOrBuilder {
    // Construct using to.bnk.api.account.DeleteAccountRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getAccountID() {
      return instance.getAccountID();
    }
    /**
     * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAccountIDBytes() {
      return instance.getAccountIDBytes();
    }
    /**
     * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAccountID(
        java.lang.String value) {
      copyOnWrite();
      instance.setAccountID(value);
      return this;
    }
    /**
     * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearAccountID() {
      copyOnWrite();
      instance.clearAccountID();
      return this;
    }
    /**
     * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAccountIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAccountIDBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:accounts.DeleteAccountRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.account.DeleteAccountRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "accountID_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.account.DeleteAccountRequest> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.account.DeleteAccountRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.account.DeleteAccountRequest>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:accounts.DeleteAccountRequest)
  private static final to.bnk.api.account.DeleteAccountRequest DEFAULT_INSTANCE;
  static {
    DeleteAccountRequest defaultInstance = new DeleteAccountRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      DeleteAccountRequest.class, defaultInstance);
  }

  public static to.bnk.api.account.DeleteAccountRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DeleteAccountRequest> PARSER;

  public static com.google.protobuf.Parser<DeleteAccountRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
