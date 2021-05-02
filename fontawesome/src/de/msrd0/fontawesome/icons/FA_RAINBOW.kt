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

object FA_RAINBOW: Icon {
	
	override val name get() = "Rainbow"
	
	override val unicode get() = "f75b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M268.3 32.7C115.4 42.9 0 176.9 0 330.2V464c0 8.8 7.2 16 16 16h32c8.8 0 16-7.2 16-16V320C64 186.8 180.9 80.3 317.5 97.9 430.4 112.4 512 214 512 327.8V464c0 8.8 7.2 16 16 16h32c8.8 0 16-7.2 16-16V320c0-165.3-140-298.6-307.7-287.3zm-5.6 96.9C166 142 96 229.1 96 326.7V464c0 8.8 7.2 16 16 16h32c8.8 0 16-7.2 16-16V320c0-74.8 64.5-134.8 140.8-127.4 66.5 6.5 115.2 66.2 115.2 133.1V464c0 8.8 7.2 16 16 16h32c8.8 0 16-7.2 16-16V320c0-114.2-100.2-205.4-217.3-190.4zm6.2 96.3c-45.6 8.9-76.9 51.5-76.9 97.9V464c0 8.8 7.2 16 16 16h32c8.8 0 16-7.2 16-16V320c0-17.6 14.3-32 32-32s32 14.4 32 32v144c0 8.8 7.2 16 16 16h32c8.8 0 16-7.2 16-16V320c0-59.2-53.8-106-115.1-94.1z"/></svg>"""
		else -> null
	}
	
}
