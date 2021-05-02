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

object FA_GOLF_BALL: Icon {
	
	override val name get() = "Golf Ball"
	
	override val unicode get() = "f450"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 416 512"><path d="M96 416h224c0 17.7-14.3 32-32 32h-16c-17.7 0-32 14.3-32 32v20c0 6.6-5.4 12-12 12h-40c-6.6 0-12-5.4-12-12v-20c0-17.7-14.3-32-32-32h-16c-17.7 0-32-14.3-32-32zm320-208c0 74.2-39 139.2-97.5 176h-221C39 347.2 0 282.2 0 208 0 93.1 93.1 0 208 0s208 93.1 208 208zm-180.1 43.9c18.3 0 33.1-14.8 33.1-33.1 0-14.4-9.3-26.3-22.1-30.9 9.6 26.8-15.6 51.3-41.9 41.9 4.6 12.8 16.5 22.1 30.9 22.1zm49.1 46.9c0-14.4-9.3-26.3-22.1-30.9 9.6 26.8-15.6 51.3-41.9 41.9 4.6 12.8 16.5 22.1 30.9 22.1 18.3 0 33.1-14.9 33.1-33.1zm64-64c0-14.4-9.3-26.3-22.1-30.9 9.6 26.8-15.6 51.3-41.9 41.9 4.6 12.8 16.5 22.1 30.9 22.1 18.3 0 33.1-14.9 33.1-33.1z"/></svg>"""
		else -> null
	}
	
}
