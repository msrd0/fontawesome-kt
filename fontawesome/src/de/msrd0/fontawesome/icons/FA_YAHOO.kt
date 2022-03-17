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
import de.msrd0.fontawesome.Style.BRANDS

/** Yahoo Logo */
object FA_YAHOO: Icon {
	
	override val name get() = "Yahoo Logo"
	
	override val unicode get() = "f19e"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M223.69,141.06,167,284.23,111,141.06H14.93L120.76,390.19,82.19,480h94.17L317.27,141.06Zm105.4,135.79a58.22,58.22,0,1,0,58.22,58.22A58.22,58.22,0,0,0,329.09,276.85ZM394.65,32l-93,223.47H406.44L499.07,32Z"/></svg>"""
		else -> null
	}
	
}
