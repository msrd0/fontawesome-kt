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

object FA_HOSPITAL_SYMBOL: Icon {
	
	override val name get() = "Hospital Symbol"
	
	override val unicode get() = "f47e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256 256-114.6 256-256S397.4 0 256 0zm112 376c0 4.4-3.6 8-8 8h-48c-4.4 0-8-3.6-8-8v-88h-96v88c0 4.4-3.6 8-8 8h-48c-4.4 0-8-3.6-8-8V136c0-4.4 3.6-8 8-8h48c4.4 0 8 3.6 8 8v88h96v-88c0-4.4 3.6-8 8-8h48c4.4 0 8 3.6 8 8v240z"/></svg>"""
		else -> null
	}
	
}
