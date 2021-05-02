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

object FA_VEST: Icon {
	
	override val name get() = "vest"
	
	override val unicode get() = "e085"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M437.252,239.877,384,160V32A32,32,0,0,0,352,0H320a24.021,24.021,0,0,0-13.312,4.031l-25,16.672a103.794,103.794,0,0,1-115.376,0l-25-16.672A24.021,24.021,0,0,0,128,0H96A32,32,0,0,0,64,32V160L10.748,239.877A64,64,0,0,0,0,275.377V480a32,32,0,0,0,32,32H192V288a31.987,31.987,0,0,1,1.643-10.119L207.135,237.4,150.188,66.564A151.518,151.518,0,0,0,224,86.234a151.55,151.55,0,0,0,73.812-19.672L224,288V512H416a32,32,0,0,0,32-32V275.377A64,64,0,0,0,437.252,239.877ZM131.312,371.312l-48,48a16,16,0,0,1-22.624-22.624l48-48a16,16,0,0,1,22.624,22.624Zm256,48a15.992,15.992,0,0,1-22.624,0l-48-48a16,16,0,0,1,22.624-22.624l48,48A15.993,15.993,0,0,1,387.312,419.312Z"/></svg>"""
		else -> null
	}
	
}
