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

/** Restroom */
object FA_RESTROOM: Icon {
	
	override val name get() = "Restroom"
	
	override val unicode get() = "f7bd"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M319.1 0C306.8 0 296 10.8 296 24v464c0 13.2 10.8 24 23.1 24s24-10.8 24-24V24C344 10.8 333.2 0 319.1 0zM213.7 171.8C204.9 145.6 180.5 128 152.9 128H103.1C75.47 128 51.06 145.6 42.37 171.8L1.653 293.9c-5.594 16.77 3.469 34.89 20.22 40.48c12.68 4.211 25.93 .1426 34.13-9.18V480c0 17.67 14.33 32 32 32s31.1-14.33 31.1-32l-.0003-144h16l.0003 144c0 17.67 14.33 32 32 32s31.1-14.33 31.1-32l-.0003-155.2c6.041 6.971 14.7 11.25 24 11.25c3.344 0 6.75-.5313 10.13-1.656c16.75-5.594 25.81-23.72 20.22-40.48L213.7 171.8zM128 96c26.5 0 47.1-21.5 47.1-48S154.5 0 128 0S80 21.5 80 48S101.5 96 128 96zM511.1 96c26.5 0 48-21.5 48-48S538.5 0 511.1 0s-47.1 21.5-47.1 48S485.5 96 511.1 96zM638.3 293.9l-40.69-122.1C588.9 145.6 564.5 128 536.9 128h-49.88c-27.59 0-52 17.59-60.69 43.75l-40.72 122.1c-5.594 16.77 3.469 34.89 20.22 40.48c3.422 1.137 6.856 1.273 10.25 1.264L399.1 384h40v96c0 17.67 14.32 32 31.1 32s32-14.33 32-32v-96h16v96c0 17.67 14.32 32 31.1 32s32-14.33 32-32v-96h39.1l-15.99-47.98c3.342 0 6.747-.5313 10.12-1.656C634.9 328.8 643.9 310.6 638.3 293.9z"/></svg>"""
		else -> null
	}
	
}
