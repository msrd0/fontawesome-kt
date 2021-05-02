/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_SOAP: Icon {
	
	override val name get() = "Soap"
	
	override val unicode get() = "e06e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M416,192a95.42,95.42,0,0,1-30.94,70.21A95.8,95.8,0,0,1,352,448H160a96,96,0,0,1,0-192h88.91A95.3,95.3,0,0,1,224,192H96A96,96,0,0,0,0,288V416a96,96,0,0,0,96,96H416a96,96,0,0,0,96-96V288A96,96,0,0,0,416,192Zm-96,64a64,64,0,1,0-64-64A64,64,0,0,0,320,256ZM208,96a48,48,0,1,0-48-48A48,48,0,0,0,208,96ZM384,64a32,32,0,1,0-32-32A32,32,0,0,0,384,64ZM160,288a64,64,0,0,0,0,128H352a64,64,0,0,0,0-128Z"/></svg>"""
		else -> null
	}
	
}
