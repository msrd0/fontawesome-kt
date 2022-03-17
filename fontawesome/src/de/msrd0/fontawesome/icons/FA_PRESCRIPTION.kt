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

object FA_PRESCRIPTION: Icon {
	
	override val name get() = "Prescription"
	
	override val unicode get() = "f5b1"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M440.1 448.4l-96.28-96.21l95.87-95.95c9.373-9.381 9.373-24.59 0-33.97l-22.62-22.64c-9.373-9.381-24.57-9.381-33.94 0L288.1 295.6L220.5 228c46.86-22.92 76.74-75.46 64.95-133.1C273.9 38.74 221.8 0 164.6 0H31.1C14.33 0 0 14.34 0 32.03v264.1c0 13.26 10.75 24.01 23.1 24.01l31.1 .085c13.25 0 23.1-10.75 23.1-24.02V240.2H119.4l112.1 112L135.4 448.4c-9.373 9.381-9.373 24.59 0 33.97l22.62 22.64c9.373 9.38 24.57 9.38 33.94 0l96.13-96.21l96.28 96.21c9.373 9.381 24.57 9.381 33.94 0l22.62-22.64C450.3 472.9 450.3 457.7 440.1 448.4zM79.1 80.06h87.1c22.06 0 39.1 17.95 39.1 40.03s-17.94 40.03-39.1 40.03H79.1V80.06z"/></svg>"""
		else -> null
	}
	
}
