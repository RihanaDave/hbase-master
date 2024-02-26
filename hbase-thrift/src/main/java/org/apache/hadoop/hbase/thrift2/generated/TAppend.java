/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)", date = "2021-07-19")
public class TAppend implements org.apache.thrift.TBase<TAppend, TAppend._Fields>, java.io.Serializable, Cloneable, Comparable<TAppend> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAppend");

  private static final org.apache.thrift.protocol.TField ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("row", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField ATTRIBUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("attributes", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField DURABILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("durability", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField CELL_VISIBILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("cellVisibility", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField RETURN_RESULTS_FIELD_DESC = new org.apache.thrift.protocol.TField("returnResults", org.apache.thrift.protocol.TType.BOOL, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TAppendStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TAppendTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer row; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TColumnValue> columns; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> attributes; // optional
  /**
   * 
   * @see TDurability
   */
  public @org.apache.thrift.annotation.Nullable TDurability durability; // optional
  public @org.apache.thrift.annotation.Nullable TCellVisibility cellVisibility; // optional
  public boolean returnResults; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROW((short)1, "row"),
    COLUMNS((short)2, "columns"),
    ATTRIBUTES((short)3, "attributes"),
    /**
     * 
     * @see TDurability
     */
    DURABILITY((short)4, "durability"),
    CELL_VISIBILITY((short)5, "cellVisibility"),
    RETURN_RESULTS((short)6, "returnResults");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROW
          return ROW;
        case 2: // COLUMNS
          return COLUMNS;
        case 3: // ATTRIBUTES
          return ATTRIBUTES;
        case 4: // DURABILITY
          return DURABILITY;
        case 5: // CELL_VISIBILITY
          return CELL_VISIBILITY;
        case 6: // RETURN_RESULTS
          return RETURN_RESULTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RETURNRESULTS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ATTRIBUTES,_Fields.DURABILITY,_Fields.CELL_VISIBILITY,_Fields.RETURN_RESULTS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROW, new org.apache.thrift.meta_data.FieldMetaData("row", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TColumnValue.class))));
    tmpMap.put(_Fields.ATTRIBUTES, new org.apache.thrift.meta_data.FieldMetaData("attributes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    tmpMap.put(_Fields.DURABILITY, new org.apache.thrift.meta_data.FieldMetaData("durability", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDurability.class)));
    tmpMap.put(_Fields.CELL_VISIBILITY, new org.apache.thrift.meta_data.FieldMetaData("cellVisibility", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TCellVisibility.class)));
    tmpMap.put(_Fields.RETURN_RESULTS, new org.apache.thrift.meta_data.FieldMetaData("returnResults", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAppend.class, metaDataMap);
  }

  public TAppend() {
  }

  public TAppend(
    java.nio.ByteBuffer row,
    java.util.List<TColumnValue> columns)
  {
    this();
    this.row = org.apache.thrift.TBaseHelper.copyBinary(row);
    this.columns = columns;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAppend(TAppend other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRow()) {
      this.row = org.apache.thrift.TBaseHelper.copyBinary(other.row);
    }
    if (other.isSetColumns()) {
      java.util.List<TColumnValue> __this__columns = new java.util.ArrayList<TColumnValue>(other.columns.size());
      for (TColumnValue other_element : other.columns) {
        __this__columns.add(new TColumnValue(other_element));
      }
      this.columns = __this__columns;
    }
    if (other.isSetAttributes()) {
      java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> __this__attributes = new java.util.HashMap<java.nio.ByteBuffer,java.nio.ByteBuffer>(other.attributes);
      this.attributes = __this__attributes;
    }
    if (other.isSetDurability()) {
      this.durability = other.durability;
    }
    if (other.isSetCellVisibility()) {
      this.cellVisibility = new TCellVisibility(other.cellVisibility);
    }
    this.returnResults = other.returnResults;
  }

  public TAppend deepCopy() {
    return new TAppend(this);
  }

  @Override
  public void clear() {
    this.row = null;
    this.columns = null;
    this.attributes = null;
    this.durability = null;
    this.cellVisibility = null;
    setReturnResultsIsSet(false);
    this.returnResults = false;
  }

  public byte[] getRow() {
    setRow(org.apache.thrift.TBaseHelper.rightSize(row));
    return row == null ? null : row.array();
  }

  public java.nio.ByteBuffer bufferForRow() {
    return org.apache.thrift.TBaseHelper.copyBinary(row);
  }

  public TAppend setRow(byte[] row) {
    this.row = row == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(row.clone());
    return this;
  }

  public TAppend setRow(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer row) {
    this.row = org.apache.thrift.TBaseHelper.copyBinary(row);
    return this;
  }

  public void unsetRow() {
    this.row = null;
  }

  /** Returns true if field row is set (has been assigned a value) and false otherwise */
  public boolean isSetRow() {
    return this.row != null;
  }

  public void setRowIsSet(boolean value) {
    if (!value) {
      this.row = null;
    }
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TColumnValue> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(TColumnValue elem) {
    if (this.columns == null) {
      this.columns = new java.util.ArrayList<TColumnValue>();
    }
    this.columns.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TColumnValue> getColumns() {
    return this.columns;
  }

  public TAppend setColumns(@org.apache.thrift.annotation.Nullable java.util.List<TColumnValue> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public int getAttributesSize() {
    return (this.attributes == null) ? 0 : this.attributes.size();
  }

  public void putToAttributes(java.nio.ByteBuffer key, java.nio.ByteBuffer val) {
    if (this.attributes == null) {
      this.attributes = new java.util.HashMap<java.nio.ByteBuffer,java.nio.ByteBuffer>();
    }
    this.attributes.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> getAttributes() {
    return this.attributes;
  }

  public TAppend setAttributes(@org.apache.thrift.annotation.Nullable java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> attributes) {
    this.attributes = attributes;
    return this;
  }

  public void unsetAttributes() {
    this.attributes = null;
  }

  /** Returns true if field attributes is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributes() {
    return this.attributes != null;
  }

  public void setAttributesIsSet(boolean value) {
    if (!value) {
      this.attributes = null;
    }
  }

  /**
   * 
   * @see TDurability
   */
  @org.apache.thrift.annotation.Nullable
  public TDurability getDurability() {
    return this.durability;
  }

  /**
   * 
   * @see TDurability
   */
  public TAppend setDurability(@org.apache.thrift.annotation.Nullable TDurability durability) {
    this.durability = durability;
    return this;
  }

  public void unsetDurability() {
    this.durability = null;
  }

  /** Returns true if field durability is set (has been assigned a value) and false otherwise */
  public boolean isSetDurability() {
    return this.durability != null;
  }

  public void setDurabilityIsSet(boolean value) {
    if (!value) {
      this.durability = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TCellVisibility getCellVisibility() {
    return this.cellVisibility;
  }

  public TAppend setCellVisibility(@org.apache.thrift.annotation.Nullable TCellVisibility cellVisibility) {
    this.cellVisibility = cellVisibility;
    return this;
  }

  public void unsetCellVisibility() {
    this.cellVisibility = null;
  }

  /** Returns true if field cellVisibility is set (has been assigned a value) and false otherwise */
  public boolean isSetCellVisibility() {
    return this.cellVisibility != null;
  }

  public void setCellVisibilityIsSet(boolean value) {
    if (!value) {
      this.cellVisibility = null;
    }
  }

  public boolean isReturnResults() {
    return this.returnResults;
  }

  public TAppend setReturnResults(boolean returnResults) {
    this.returnResults = returnResults;
    setReturnResultsIsSet(true);
    return this;
  }

  public void unsetReturnResults() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RETURNRESULTS_ISSET_ID);
  }

  /** Returns true if field returnResults is set (has been assigned a value) and false otherwise */
  public boolean isSetReturnResults() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RETURNRESULTS_ISSET_ID);
  }

  public void setReturnResultsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RETURNRESULTS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ROW:
      if (value == null) {
        unsetRow();
      } else {
        if (value instanceof byte[]) {
          setRow((byte[])value);
        } else {
          setRow((java.nio.ByteBuffer)value);
        }
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((java.util.List<TColumnValue>)value);
      }
      break;

    case ATTRIBUTES:
      if (value == null) {
        unsetAttributes();
      } else {
        setAttributes((java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer>)value);
      }
      break;

    case DURABILITY:
      if (value == null) {
        unsetDurability();
      } else {
        setDurability((TDurability)value);
      }
      break;

    case CELL_VISIBILITY:
      if (value == null) {
        unsetCellVisibility();
      } else {
        setCellVisibility((TCellVisibility)value);
      }
      break;

    case RETURN_RESULTS:
      if (value == null) {
        unsetReturnResults();
      } else {
        setReturnResults((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ROW:
      return getRow();

    case COLUMNS:
      return getColumns();

    case ATTRIBUTES:
      return getAttributes();

    case DURABILITY:
      return getDurability();

    case CELL_VISIBILITY:
      return getCellVisibility();

    case RETURN_RESULTS:
      return isReturnResults();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ROW:
      return isSetRow();
    case COLUMNS:
      return isSetColumns();
    case ATTRIBUTES:
      return isSetAttributes();
    case DURABILITY:
      return isSetDurability();
    case CELL_VISIBILITY:
      return isSetCellVisibility();
    case RETURN_RESULTS:
      return isSetReturnResults();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TAppend)
      return this.equals((TAppend)that);
    return false;
  }

  public boolean equals(TAppend that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_row = true && this.isSetRow();
    boolean that_present_row = true && that.isSetRow();
    if (this_present_row || that_present_row) {
      if (!(this_present_row && that_present_row))
        return false;
      if (!this.row.equals(that.row))
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_attributes = true && this.isSetAttributes();
    boolean that_present_attributes = true && that.isSetAttributes();
    if (this_present_attributes || that_present_attributes) {
      if (!(this_present_attributes && that_present_attributes))
        return false;
      if (!this.attributes.equals(that.attributes))
        return false;
    }

    boolean this_present_durability = true && this.isSetDurability();
    boolean that_present_durability = true && that.isSetDurability();
    if (this_present_durability || that_present_durability) {
      if (!(this_present_durability && that_present_durability))
        return false;
      if (!this.durability.equals(that.durability))
        return false;
    }

    boolean this_present_cellVisibility = true && this.isSetCellVisibility();
    boolean that_present_cellVisibility = true && that.isSetCellVisibility();
    if (this_present_cellVisibility || that_present_cellVisibility) {
      if (!(this_present_cellVisibility && that_present_cellVisibility))
        return false;
      if (!this.cellVisibility.equals(that.cellVisibility))
        return false;
    }

    boolean this_present_returnResults = true && this.isSetReturnResults();
    boolean that_present_returnResults = true && that.isSetReturnResults();
    if (this_present_returnResults || that_present_returnResults) {
      if (!(this_present_returnResults && that_present_returnResults))
        return false;
      if (this.returnResults != that.returnResults)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRow()) ? 131071 : 524287);
    if (isSetRow())
      hashCode = hashCode * 8191 + row.hashCode();

    hashCode = hashCode * 8191 + ((isSetColumns()) ? 131071 : 524287);
    if (isSetColumns())
      hashCode = hashCode * 8191 + columns.hashCode();

    hashCode = hashCode * 8191 + ((isSetAttributes()) ? 131071 : 524287);
    if (isSetAttributes())
      hashCode = hashCode * 8191 + attributes.hashCode();

    hashCode = hashCode * 8191 + ((isSetDurability()) ? 131071 : 524287);
    if (isSetDurability())
      hashCode = hashCode * 8191 + durability.getValue();

    hashCode = hashCode * 8191 + ((isSetCellVisibility()) ? 131071 : 524287);
    if (isSetCellVisibility())
      hashCode = hashCode * 8191 + cellVisibility.hashCode();

    hashCode = hashCode * 8191 + ((isSetReturnResults()) ? 131071 : 524287);
    if (isSetReturnResults())
      hashCode = hashCode * 8191 + ((returnResults) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TAppend other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetRow(), other.isSetRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.row, other.row);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColumns(), other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAttributes(), other.isSetAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attributes, other.attributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDurability(), other.isSetDurability());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDurability()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.durability, other.durability);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCellVisibility(), other.isSetCellVisibility());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCellVisibility()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cellVisibility, other.cellVisibility);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetReturnResults(), other.isSetReturnResults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReturnResults()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.returnResults, other.returnResults);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TAppend(");
    boolean first = true;

    sb.append("row:");
    if (this.row == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.row, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    if (isSetAttributes()) {
      if (!first) sb.append(", ");
      sb.append("attributes:");
      if (this.attributes == null) {
        sb.append("null");
      } else {
        sb.append(this.attributes);
      }
      first = false;
    }
    if (isSetDurability()) {
      if (!first) sb.append(", ");
      sb.append("durability:");
      if (this.durability == null) {
        sb.append("null");
      } else {
        sb.append(this.durability);
      }
      first = false;
    }
    if (isSetCellVisibility()) {
      if (!first) sb.append(", ");
      sb.append("cellVisibility:");
      if (this.cellVisibility == null) {
        sb.append("null");
      } else {
        sb.append(this.cellVisibility);
      }
      first = false;
    }
    if (isSetReturnResults()) {
      if (!first) sb.append(", ");
      sb.append("returnResults:");
      sb.append(this.returnResults);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (row == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'row' was not present! Struct: " + toString());
    }
    if (columns == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'columns' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (cellVisibility != null) {
      cellVisibility.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TAppendStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TAppendStandardScheme getScheme() {
      return new TAppendStandardScheme();
    }
  }

  private static class TAppendStandardScheme extends org.apache.thrift.scheme.StandardScheme<TAppend> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAppend struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.row = iprot.readBinary();
              struct.setRowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list88 = iprot.readListBegin();
                struct.columns = new java.util.ArrayList<TColumnValue>(_list88.size);
                @org.apache.thrift.annotation.Nullable TColumnValue _elem89;
                for (int _i90 = 0; _i90 < _list88.size; ++_i90)
                {
                  _elem89 = new TColumnValue();
                  _elem89.read(iprot);
                  struct.columns.add(_elem89);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ATTRIBUTES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map91 = iprot.readMapBegin();
                struct.attributes = new java.util.HashMap<java.nio.ByteBuffer,java.nio.ByteBuffer>(2*_map91.size);
                @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _key92;
                @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _val93;
                for (int _i94 = 0; _i94 < _map91.size; ++_i94)
                {
                  _key92 = iprot.readBinary();
                  _val93 = iprot.readBinary();
                  struct.attributes.put(_key92, _val93);
                }
                iprot.readMapEnd();
              }
              struct.setAttributesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DURABILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.durability = org.apache.hadoop.hbase.thrift2.generated.TDurability.findByValue(iprot.readI32());
              struct.setDurabilityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CELL_VISIBILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cellVisibility = new TCellVisibility();
              struct.cellVisibility.read(iprot);
              struct.setCellVisibilityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // RETURN_RESULTS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.returnResults = iprot.readBool();
              struct.setReturnResultsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAppend struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.row != null) {
        oprot.writeFieldBegin(ROW_FIELD_DESC);
        oprot.writeBinary(struct.row);
        oprot.writeFieldEnd();
      }
      if (struct.columns != null) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.columns.size()));
          for (TColumnValue _iter95 : struct.columns)
          {
            _iter95.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.attributes != null) {
        if (struct.isSetAttributes()) {
          oprot.writeFieldBegin(ATTRIBUTES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.attributes.size()));
            for (java.util.Map.Entry<java.nio.ByteBuffer, java.nio.ByteBuffer> _iter96 : struct.attributes.entrySet())
            {
              oprot.writeBinary(_iter96.getKey());
              oprot.writeBinary(_iter96.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.durability != null) {
        if (struct.isSetDurability()) {
          oprot.writeFieldBegin(DURABILITY_FIELD_DESC);
          oprot.writeI32(struct.durability.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.cellVisibility != null) {
        if (struct.isSetCellVisibility()) {
          oprot.writeFieldBegin(CELL_VISIBILITY_FIELD_DESC);
          struct.cellVisibility.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetReturnResults()) {
        oprot.writeFieldBegin(RETURN_RESULTS_FIELD_DESC);
        oprot.writeBool(struct.returnResults);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAppendTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TAppendTupleScheme getScheme() {
      return new TAppendTupleScheme();
    }
  }

  private static class TAppendTupleScheme extends org.apache.thrift.scheme.TupleScheme<TAppend> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAppend struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeBinary(struct.row);
      {
        oprot.writeI32(struct.columns.size());
        for (TColumnValue _iter97 : struct.columns)
        {
          _iter97.write(oprot);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAttributes()) {
        optionals.set(0);
      }
      if (struct.isSetDurability()) {
        optionals.set(1);
      }
      if (struct.isSetCellVisibility()) {
        optionals.set(2);
      }
      if (struct.isSetReturnResults()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAttributes()) {
        {
          oprot.writeI32(struct.attributes.size());
          for (java.util.Map.Entry<java.nio.ByteBuffer, java.nio.ByteBuffer> _iter98 : struct.attributes.entrySet())
          {
            oprot.writeBinary(_iter98.getKey());
            oprot.writeBinary(_iter98.getValue());
          }
        }
      }
      if (struct.isSetDurability()) {
        oprot.writeI32(struct.durability.getValue());
      }
      if (struct.isSetCellVisibility()) {
        struct.cellVisibility.write(oprot);
      }
      if (struct.isSetReturnResults()) {
        oprot.writeBool(struct.returnResults);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAppend struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.row = iprot.readBinary();
      struct.setRowIsSet(true);
      {
        org.apache.thrift.protocol.TList _list99 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.columns = new java.util.ArrayList<TColumnValue>(_list99.size);
        @org.apache.thrift.annotation.Nullable TColumnValue _elem100;
        for (int _i101 = 0; _i101 < _list99.size; ++_i101)
        {
          _elem100 = new TColumnValue();
          _elem100.read(iprot);
          struct.columns.add(_elem100);
        }
      }
      struct.setColumnsIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map102 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING); 
          struct.attributes = new java.util.HashMap<java.nio.ByteBuffer,java.nio.ByteBuffer>(2*_map102.size);
          @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _key103;
          @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _val104;
          for (int _i105 = 0; _i105 < _map102.size; ++_i105)
          {
            _key103 = iprot.readBinary();
            _val104 = iprot.readBinary();
            struct.attributes.put(_key103, _val104);
          }
        }
        struct.setAttributesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.durability = org.apache.hadoop.hbase.thrift2.generated.TDurability.findByValue(iprot.readI32());
        struct.setDurabilityIsSet(true);
      }
      if (incoming.get(2)) {
        struct.cellVisibility = new TCellVisibility();
        struct.cellVisibility.read(iprot);
        struct.setCellVisibilityIsSet(true);
      }
      if (incoming.get(3)) {
        struct.returnResults = iprot.readBool();
        struct.setReturnResultsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

