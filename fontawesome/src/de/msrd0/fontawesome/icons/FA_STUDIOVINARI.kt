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

/** Studio Vinari */
object FA_STUDIOVINARI: Icon {
	
	override val name get() = "Studio Vinari"
	
	override val unicode get() = "f3f8"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M480.3 187.7l4.2 28v28l-25.1 44.1-39.8 78.4-56.1 67.5-79.1 37.8-17.7 24.5-7.7 12-9.6 4s17.3-63.6 19.4-63.6c2.1 0 20.3.7 20.3.7l66.7-38.6-92.5 26.1-55.9 36.8-22.8 28-6.6 1.4 20.8-73.6 6.9-5.5 20.7 12.9 88.3-45.2 56.8-51.5 14.8-68.4-125.4 23.3 15.2-18.2-173.4-53.3 81.9-10.5-166-122.9L133.5 108 32.2 0l252.9 126.6-31.5-38L378 163 234.7 64l18.7 38.4-49.6-18.1L158.3 0l194.6 122L310 66.2l108 96.4 12-8.9-21-16.4 4.2-37.8L451 89.1l29.2 24.7 11.5 4.2-7 6.2 8.5 12-13.1 7.4-10.3 20.2 10.5 23.9z"/></svg>"""
		else -> null
	}
	
}