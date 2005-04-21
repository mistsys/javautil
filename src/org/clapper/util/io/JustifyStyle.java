/*---------------------------------------------------------------------------*\
  $Id$
  ---------------------------------------------------------------------------
  This software is released under a Berkeley-style license:

  Copyright (c) 2004 Brian M. Clapper. All rights reserved.

  Redistribution and use in source and binary forms are permitted provided
  that: (1) source distributions retain this entire copyright notice and
  comment; and (2) modifications made to the software are prominently
  mentioned, and a copy of the original software (or a pointer to its
  location) are included. The name of the author may not be used to endorse
  or promote products derived from this software without specific prior
  written permission.

  THIS SOFTWARE IS PROVIDED ``AS IS'' AND WITHOUT ANY EXPRESS OR IMPLIED
  WARRANTIES, INCLUDING, WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF
  MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.

  Effectively, this means you can do what you want with the software except
  remove this notice or take advantage of the author's name. If you modify
  the software and redistribute your modified version, you must indicate that
  your version is a modification of the original, and you must provide either
  a pointer to or a copy of the original.
\*---------------------------------------------------------------------------*/

package org.clapper.util.io;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

import org.clapper.util.text.TextUtil;

/**
 * <p>The <tt>JustifyStyle</tt> enumeration spells out the legal field
 * justification values for classes such as {@link JustifyTextWriter}. It
 * resides in a separate class for readability.</p>
 *
 * @see JustifyTextWriter
 * @see TextUtil#rightJustifyString(String,int)
 * @see TextUtil#leftJustifyString(String,int)
 * @see TextUtil#centerString(String,int)
 *
 * @version $Revision$
 *
 * @author Copyright &copy; 2004 Brian M. Clapper
 */
public enum JustifyStyle
{
    RIGHT_JUSTIFY, LEFT_JUSTIFY, CENTER
}