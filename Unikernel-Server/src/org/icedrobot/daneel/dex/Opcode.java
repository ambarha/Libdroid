/*
 * Daneel - Dalvik to Java bytecode compiler
 * Copyright (C) 2011  IcedRobot team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * This file is subject to the "Classpath" exception:
 *
 * Linking this library statically or dynamically with other modules is
 * making a combined work based on this library.  Thus, the terms and
 * conditions of the GNU General Public License cover the whole
 * combination.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under terms
 * of your choice, provided that you also meet, for each linked independent
 * module, the terms and conditions of the license of that module.  An
 * independent module is a module which is not derived from or based on
 * this library.  If you modify this library, you may extend this exception
 * to your version of the library, but you are not obligated to do so.  If
 * you do not wish to do so, delete this exception statement from your
 * version.
 */

package org.icedrobot.daneel.dex;

/**
 * Enumeration of all opcodes available in Dalvik VM bytecode.
 */
public enum Opcode {
    NOP(0x00),
    MOVE(0x01),
    MOVE_FROM16(0x02),
    MOVE_16(0x03),
    MOVE_WIDE(0x04),
    MOVE_WIDE_FROM16(0x05),
    MOVE_WIDE_16(0x06),
    MOVE_OBJECT(0x07),
    MOVE_OBJECT_FROM16(0x08),
    MOVE_OBJECT_16(0x09),
    MOVE_RESULT(0x0a),
    MOVE_RESULT_WIDE(0x0b),
    MOVE_RESULT_OBJECT(0x0c),
    MOVE_EXCEPTION(0x0d),
    RETURN_VOID(0x0e),
    RETURN(0x0f),
    RETURN_WIDE(0x10),
    RETURN_OBJECT(0x11),
    CONST_4(0x12),
    CONST_16(0x13),
    CONST(0x14),
    CONST_HIGH16(0x15),
    CONST_WIDE_16(0x16),
    CONST_WIDE_32(0x17),
    CONST_WIDE(0x18),
    CONST_WIDE_HIGH16(0x19),
    CONST_STRING(0x1a),
    CONST_STRING_JUMBO(0x1b),
    CONST_CLASS(0x1c),
    MONITOR_ENTER(0x1d),
    MONITOR_EXIT(0x1e),
    CHECK_CAST(0x1f),
    INSTANCE_OF(0x20),
    ARRAY_LENGTH(0x21),
    NEW_INSTANCE(0x22),
    NEW_ARRAY(0x23),
    FILLED_NEW_ARRAY(0x24),
    FILLED_NEW_ARRAY_RANGE(0x25),
    FILL_ARRAY_DATA(0x26),
    THROW(0x27),
    GOTO(0x28),
    GOTO_16(0x29),
    GOTO_32(0x2a),
    PACKED_SWITCH(0x2b),
    SPARSE_SWITCH(0x2c),
    CMPL_FLOAT(0x2d),
    CMPG_FLOAT(0x2e),
    CMPL_DOUBLE(0x2f),
    CMPG_DOUBLE(0x30),
    CMP_LONG(0x31),
    IF_EQ(0x32),
    IF_NE(0x33),
    IF_LT(0x34),
    IF_GE(0x35),
    IF_GT(0x36),
    IF_LE(0x37),
    IF_EQZ(0x38),
    IF_NEZ(0x39),
    IF_LTZ(0x3a),
    IF_GEZ(0x3b),
    IF_GTZ(0x3c),
    IF_LEZ(0x3d),
    UNUSED_3E(0x3e),
    UNUSED_3F(0x3f),
    UNUSED_40(0x40),
    UNUSED_41(0x41),
    UNUSED_42(0x42),
    UNUSED_43(0x43),
    AGET(0x44),
    AGET_WIDE(0x45),
    AGET_OBJECT(0x46),
    AGET_BOOLEAN(0x47),
    AGET_BYTE(0x48),
    AGET_CHAR(0x49),
    AGET_SHORT(0x4a),
    APUT(0x4b),
    APUT_WIDE(0x4c),
    APUT_OBJECT(0x4d),
    APUT_BOOLEAN(0x4e),
    APUT_BYTE(0x4f),
    APUT_CHAR(0x50),
    APUT_SHORT(0x51),
    IGET(0x52),
    IGET_WIDE(0x53),
    IGET_OBJECT(0x54),
    IGET_BOOLEAN(0x55),
    IGET_BYTE(0x56),
    IGET_CHAR(0x57),
    IGET_SHORT(0x58),
    IPUT(0x59),
    IPUT_WIDE(0x5a),
    IPUT_OBJECT(0x5b),
    IPUT_BOOLEAN(0x5c),
    IPUT_BYTE(0x5d),
    IPUT_CHAR(0x5e),
    IPUT_SHORT(0x5f),
    SGET(0x60),
    SGET_WIDE(0x61),
    SGET_OBJECT(0x62),
    SGET_BOOLEAN(0x63),
    SGET_BYTE(0x64),
    SGET_CHAR(0x65),
    SGET_SHORT(0x66),
    SPUT(0x67),
    SPUT_WIDE(0x68),
    SPUT_OBJECT(0x69),
    SPUT_BOOLEAN(0x6a),
    SPUT_BYTE(0x6b),
    SPUT_CHAR(0x6c),
    SPUT_SHORT(0x6d),
    INVOKE_VIRTUAL(0x6e),
    INVOKE_SUPER(0x6f),
    INVOKE_DIRECT(0x70),
    INVOKE_STATIC(0x71),
    INVOKE_INTERFACE(0x72),
    UNUSED_73(0x73),
    INVOKE_VIRTUAL_RANGE(0x74),
    INVOKE_SUPER_RANGE(0x75),
    INVOKE_DIRECT_RANGE(0x76),
    INVOKE_STATIC_RANGE(0x77),
    INVOKE_INTERFACE_RANGE(0x78),
    UNUSED_79(0x79),
    UNUSED_7A(0x7a),
    NEG_INT(0x7b),
    NOT_INT(0x7c),
    NEG_LONG(0x7d),
    NOT_LONG(0x7e),
    NEG_FLOAT(0x7f),
    NEG_DOUBLE(0x80),
    INT_TO_LONG(0x81),
    INT_TO_FLOAT(0x82),
    INT_TO_DOUBLE(0x83),
    LONG_TO_INT(0x84),
    LONG_TO_FLOAT(0x85),
    LONG_TO_DOUBLE(0x86),
    FLOAT_TO_INT(0x87),
    FLOAT_TO_LONG(0x88),
    FLOAT_TO_DOUBLE(0x89),
    DOUBLE_TO_INT(0x8a),
    DOUBLE_TO_LONG(0x8b),
    DOUBLE_TO_FLOAT(0x8c),
    INT_TO_BYTE(0x8d),
    INT_TO_CHAR(0x8e),
    INT_TO_SHORT(0x8f),
    ADD_INT(0x90),
    SUB_INT(0x91),
    MUL_INT(0x92),
    DIV_INT(0x93),
    REM_INT(0x94),
    AND_INT(0x95),
    OR_INT(0x96),
    XOR_INT(0x97),
    SHL_INT(0x98),
    SHR_INT(0x99),
    USHR_INT(0x9a),
    ADD_LONG(0x9b),
    SUB_LONG(0x9c),
    MUL_LONG(0x9d),
    DIV_LONG(0x9e),
    REM_LONG(0x9f),
    AND_LONG(0xa0),
    OR_LONG(0xa1),
    XOR_LONG(0xa2),
    SHL_LONG(0xa3),
    SHR_LONG(0xa4),
    USHR_LONG(0xa5),
    ADD_FLOAT(0xa6),
    SUB_FLOAT(0xa7),
    MUL_FLOAT(0xa8),
    DIV_FLOAT(0xa9),
    REM_FLOAT(0xaa),
    ADD_DOUBLE(0xab),
    SUB_DOUBLE(0xac),
    MUL_DOUBLE(0xad),
    DIV_DOUBLE(0xae),
    REM_DOUBLE(0xaf),
    ADD_INT_2ADDR(0xb0),
    SUB_INT_2ADDR(0xb1),
    MUL_INT_2ADDR(0xb2),
    DIV_INT_2ADDR(0xb3),
    REM_INT_2ADDR(0xb4),
    AND_INT_2ADDR(0xb5),
    OR_INT_2ADDR(0xb6),
    XOR_INT_2ADDR(0xb7),
    SHL_INT_2ADDR(0xb8),
    SHR_INT_2ADDR(0xb9),
    USHR_INT_2ADDR(0xba),
    ADD_LONG_2ADDR(0xbb),
    SUB_LONG_2ADDR(0xbc),
    MUL_LONG_2ADDR(0xbd),
    DIV_LONG_2ADDR(0xbe),
    REM_LONG_2ADDR(0xbf),
    AND_LONG_2ADDR(0xc0),
    OR_LONG_2ADDR(0xc1),
    XOR_LONG_2ADDR(0xc2),
    SHL_LONG_2ADDR(0xc3),
    SHR_LONG_2ADDR(0xc4),
    USHR_LONG_2ADDR(0xc5),
    ADD_FLOAT_2ADDR(0xc6),
    SUB_FLOAT_2ADDR(0xc7),
    MUL_FLOAT_2ADDR(0xc8),
    DIV_FLOAT_2ADDR(0xc9),
    REM_FLOAT_2ADDR(0xca),
    ADD_DOUBLE_2ADDR(0xcb),
    SUB_DOUBLE_2ADDR(0xcc),
    MUL_DOUBLE_2ADDR(0xcd),
    DIV_DOUBLE_2ADDR(0xce),
    REM_DOUBLE_2ADDR(0xcf),
    ADD_INT_LIT16(0xd0),
    RSUB_INT_LIT16(0xd1),
    MUL_INT_LIT16(0xd2),
    DIV_INT_LIT16(0xd3),
    REM_INT_LIT16(0xd4),
    AND_INT_LIT16(0xd5),
    OR_INT_LIT16(0xd6),
    XOR_INT_LIT16(0xd7),
    ADD_INT_LIT8(0xd8),
    RSUB_INT_LIT8(0xd9),
    MUL_INT_LIT8(0xda),
    DIV_INT_LIT8(0xdb),
    REM_INT_LIT8(0xdc),
    AND_INT_LIT8(0xdd),
    OR_INT_LIT8(0xde),
    XOR_INT_LIT8(0xdf),
    SHL_INT_LIT8(0xe0),
    SHR_INT_LIT8(0xe1),
    USHR_INT_LIT8(0xe2),
    IGET_VOLATILE(0xe3),
    IPUT_VOLATILE(0xe4),
    SGET_VOLATILE(0xe5),
    SPUT_VOLATILE(0xe6),
    IGET_OBJECT_VOLATILE(0xe7),
    IGET_WIDE_VOLATILE(0xe8),
    IPUT_WIDE_VOLATILE(0xe9),
    SGET_WIDE_VOLATILE(0xea),
    SPUT_WIDE_VOLATILE(0xeb),
    UNUSED_EC(0xec),
    UNUSED_ED(0xed),
    EXECUTE_INLINE(0xee),
    EXECUTE_INLINE_RANGE(0xef),
    INVOKE_DIRECT_EMPTY(0xf0),
    IGET_QUICK(0xf2),
    IGET_WIDE_QUICK(0xf3),
    IGET_OBJECT_QUICK(0xf4),
    IPUT_QUICK(0xf5),
    IPUT_WIDE_QUICK(0xf6),
    IPUT_OBJECT_QUICK(0xf7),
    INVOKE_VIRTUAL_QUICK(0xf8),
    INVOKE_VIRTUAL_QUICK_RANGE(0xf9),
    INVOKE_SUPER_QUICK(0xfa),
    INVOKE_SUPER_QUICK_RANGE(0xfb),
    IPUT_OBJECT_VOLATILE(0xfc),
    SGET_OBJECT_VOLATILE(0xfd),
    SPUT_OBJECT_VOLATILE(0xfe),
    UNUSED_FF(0xff);

    private final static Opcode[] OPCODES = Opcode.values();

    public static Opcode getOpcode(int opcode) {
        return OPCODES[opcode];
    }

    private final int op;

    private Opcode(int op) {
        this.op = op;
    }

    @Override
    public String toString() {
        return name() + '(' + op + ')';
    }
}
