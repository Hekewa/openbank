// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.account;

public interface GetAccountStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:accounts.GetAccountStatusResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getAccountID();
  /**
   * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getAccountIDBytes();

  /**
   * <code>.google.protobuf.Timestamp EffectiveDate = 2[json_name = "effetive_date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasEffectiveDate();
  /**
   * <code>.google.protobuf.Timestamp EffectiveDate = 2[json_name = "effetive_date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.Timestamp getEffectiveDate();

  /**
   * <code>string Status = 3[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getStatus();
  /**
   * <code>string Status = 3[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>string StatusDescription = 4[json_name = "status_description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getStatusDescription();
  /**
   * <code>string StatusDescription = 4[json_name = "status_description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getStatusDescriptionBytes();
}