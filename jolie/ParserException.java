/***************************************************************************
 *   Copyright (C) by Fabrizio Montesi <famontesi@gmail.com>               *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU Library General Public License as       *
 *   published by the Free Software Foundation; either version 2 of the    *
 *   License, or (at your option) any later version.                       *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU Library General Public     *
 *   License along with this program; if not, write to the                 *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 ***************************************************************************/

package jolie;

public class ParserException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	private String sourceName;
	private int line;
	private String mesg;
	
	public ParserException( String sourceName, int line, String mesg )
	{
		this.sourceName = sourceName;
		this.line = line;
		this.mesg = mesg;
	}
	
	public String getMessage()
	{
		String ret = new String();
		ret += this.sourceName;
		ret += ":" + line + ": error: " + mesg;
		return ret;
	}
}