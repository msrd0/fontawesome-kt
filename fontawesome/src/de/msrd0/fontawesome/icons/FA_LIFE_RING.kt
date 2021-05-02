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
import de.msrd0.fontawesome.Style.REGULAR

object FA_LIFE_RING: Icon {
	
	override val name get() = "Life Ring"
	
	override val unicode get() = "f1cd"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm173.696 119.559l-63.399 63.399c-10.987-18.559-26.67-34.252-45.255-45.255l63.399-63.399a218.396 218.396 0 0 1 45.255 45.255zM256 352c-53.019 0-96-42.981-96-96s42.981-96 96-96 96 42.981 96 96-42.981 96-96 96zM127.559 82.304l63.399 63.399c-18.559 10.987-34.252 26.67-45.255 45.255l-63.399-63.399a218.372 218.372 0 0 1 45.255-45.255zM82.304 384.441l63.399-63.399c10.987 18.559 26.67 34.252 45.255 45.255l-63.399 63.399a218.396 218.396 0 0 1-45.255-45.255zm302.137 45.255l-63.399-63.399c18.559-10.987 34.252-26.67 45.255-45.255l63.399 63.399a218.403 218.403 0 0 1-45.255 45.255z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 504c136.967 0 248-111.033 248-248S392.967 8 256 8 8 119.033 8 256s111.033 248 248 248zm-103.398-76.72l53.411-53.411c31.806 13.506 68.128 13.522 99.974 0l53.411 53.411c-63.217 38.319-143.579 38.319-206.796 0zM336 256c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80zm91.28 103.398l-53.411-53.411c13.505-31.806 13.522-68.128 0-99.974l53.411-53.411c38.319 63.217 38.319 143.579 0 206.796zM359.397 84.72l-53.411 53.411c-31.806-13.505-68.128-13.522-99.973 0L152.602 84.72c63.217-38.319 143.579-38.319 206.795 0zM84.72 152.602l53.411 53.411c-13.506 31.806-13.522 68.128 0 99.974L84.72 359.398c-38.319-63.217-38.319-143.579 0-206.796z"/></svg>"""
		else -> null
	}
	
}
