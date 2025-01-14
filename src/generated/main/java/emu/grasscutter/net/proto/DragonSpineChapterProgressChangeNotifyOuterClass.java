// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DragonSpineChapterProgressChangeNotify.proto

package emu.grasscutter.net.proto;

public final class DragonSpineChapterProgressChangeNotifyOuterClass {
  private DragonSpineChapterProgressChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DragonSpineChapterProgressChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DragonSpineChapterProgressChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 schedule_id = 4;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>uint32 chapter_id = 11;</code>
     * @return The chapterId.
     */
    int getChapterId();

    /**
     * <code>uint32 cur_progress = 1;</code>
     * @return The curProgress.
     */
    int getCurProgress();
  }
  /**
   * <pre>
   * CmdId: 2161
   * Obf: CELNOIPFMAO
   * </pre>
   *
   * Protobuf type {@code DragonSpineChapterProgressChangeNotify}
   */
  public static final class DragonSpineChapterProgressChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DragonSpineChapterProgressChangeNotify)
      DragonSpineChapterProgressChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DragonSpineChapterProgressChangeNotify.newBuilder() to construct.
    private DragonSpineChapterProgressChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DragonSpineChapterProgressChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DragonSpineChapterProgressChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DragonSpineChapterProgressChangeNotify(
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

              curProgress_ = input.readUInt32();
              break;
            }
            case 32: {

              scheduleId_ = input.readUInt32();
              break;
            }
            case 88: {

              chapterId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.internal_static_DragonSpineChapterProgressChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.internal_static_DragonSpineChapterProgressChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.class, emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.Builder.class);
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 4;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 4;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int CHAPTER_ID_FIELD_NUMBER = 11;
    private int chapterId_;
    /**
     * <code>uint32 chapter_id = 11;</code>
     * @return The chapterId.
     */
    @java.lang.Override
    public int getChapterId() {
      return chapterId_;
    }

    public static final int CUR_PROGRESS_FIELD_NUMBER = 1;
    private int curProgress_;
    /**
     * <code>uint32 cur_progress = 1;</code>
     * @return The curProgress.
     */
    @java.lang.Override
    public int getCurProgress() {
      return curProgress_;
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
      if (curProgress_ != 0) {
        output.writeUInt32(1, curProgress_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(4, scheduleId_);
      }
      if (chapterId_ != 0) {
        output.writeUInt32(11, chapterId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, curProgress_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, scheduleId_);
      }
      if (chapterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, chapterId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify other = (emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify) obj;

      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (getChapterId()
          != other.getChapterId()) return false;
      if (getCurProgress()
          != other.getCurProgress()) return false;
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
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (37 * hash) + CHAPTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChapterId();
      hash = (37 * hash) + CUR_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getCurProgress();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify prototype) {
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
     * CmdId: 2161
     * Obf: CELNOIPFMAO
     * </pre>
     *
     * Protobuf type {@code DragonSpineChapterProgressChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DragonSpineChapterProgressChangeNotify)
        emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.internal_static_DragonSpineChapterProgressChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.internal_static_DragonSpineChapterProgressChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.class, emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.newBuilder()
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
        scheduleId_ = 0;

        chapterId_ = 0;

        curProgress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.internal_static_DragonSpineChapterProgressChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify build() {
        emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify buildPartial() {
        emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify result = new emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify(this);
        result.scheduleId_ = scheduleId_;
        result.chapterId_ = chapterId_;
        result.curProgress_ = curProgress_;
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
        if (other instanceof emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify other) {
        if (other == emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.getDefaultInstance()) return this;
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (other.getChapterId() != 0) {
          setChapterId(other.getChapterId());
        }
        if (other.getCurProgress() != 0) {
          setCurProgress(other.getCurProgress());
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
        emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 4;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 4;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private int chapterId_ ;
      /**
       * <code>uint32 chapter_id = 11;</code>
       * @return The chapterId.
       */
      @java.lang.Override
      public int getChapterId() {
        return chapterId_;
      }
      /**
       * <code>uint32 chapter_id = 11;</code>
       * @param value The chapterId to set.
       * @return This builder for chaining.
       */
      public Builder setChapterId(int value) {
        
        chapterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chapter_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearChapterId() {
        
        chapterId_ = 0;
        onChanged();
        return this;
      }

      private int curProgress_ ;
      /**
       * <code>uint32 cur_progress = 1;</code>
       * @return The curProgress.
       */
      @java.lang.Override
      public int getCurProgress() {
        return curProgress_;
      }
      /**
       * <code>uint32 cur_progress = 1;</code>
       * @param value The curProgress to set.
       * @return This builder for chaining.
       */
      public Builder setCurProgress(int value) {
        
        curProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_progress = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurProgress() {
        
        curProgress_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:DragonSpineChapterProgressChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:DragonSpineChapterProgressChangeNotify)
    private static final emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify();
    }

    public static emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DragonSpineChapterProgressChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<DragonSpineChapterProgressChangeNotify>() {
      @java.lang.Override
      public DragonSpineChapterProgressChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DragonSpineChapterProgressChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DragonSpineChapterProgressChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DragonSpineChapterProgressChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DragonSpineChapterProgressChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DragonSpineChapterProgressChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,DragonSpineChapterProgressChangeNotify" +
      ".proto\"g\n&DragonSpineChapterProgressChan" +
      "geNotify\022\023\n\013schedule_id\030\004 \001(\r\022\022\n\nchapter" +
      "_id\030\013 \001(\r\022\024\n\014cur_progress\030\001 \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DragonSpineChapterProgressChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DragonSpineChapterProgressChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DragonSpineChapterProgressChangeNotify_descriptor,
        new java.lang.String[] { "ScheduleId", "ChapterId", "CurProgress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
