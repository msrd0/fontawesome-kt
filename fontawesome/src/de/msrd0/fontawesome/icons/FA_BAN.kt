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

/** ban */
object FA_BAN: Icon {
	
	override val name get() = "ban"
	
	override val unicode get() = "f05e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM99.5 144.8C77.15 176.1 64 214.5 64 256C64 362 149.1 448 256 448C297.5 448 335.9 434.9 367.2 412.5L99.5 144.8zM448 256C448 149.1 362 64 256 64C214.5 64 176.1 77.15 144.8 99.5L412.5 367.2C434.9 335.9 448 297.5 448 256V256z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_BAN]. */
val FA_CANCEL = FA_BAN
