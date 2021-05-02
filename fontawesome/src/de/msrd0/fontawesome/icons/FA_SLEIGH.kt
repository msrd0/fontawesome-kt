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

object FA_SLEIGH: Icon {
	
	override val name get() = "Sleigh"
	
	override val unicode get() = "f7cc"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M612.7 350.7l-9.3-7.4c-6.9-5.5-17-4.4-22.5 2.5l-10 12.5c-5.5 6.9-4.4 17 2.5 22.5l9.3 7.4c5.9 4.7 9.2 11.7 9.2 19.2 0 13.6-11 24.6-24.6 24.6H48c-8.8 0-16 7.2-16 16v16c0 8.8 7.2 16 16 16h516c39 0 73.7-29.3 75.9-68.3 1.4-23.8-8.7-46.3-27.2-61zM32 224c0 59.6 40.9 109.2 96 123.5V400h64v-48h192v48h64v-48c53 0 96-43 96-96v-96c17.7 0 32-14.3 32-32s-14.3-32-32-32h-96v64c0 35.3-28.7 64-64 64h-20.7c-65.8 0-125.9-37.2-155.3-96-29.4-58.8-89.6-96-155.3-96H32C14.3 32 0 46.3 0 64s14.3 32 32 32v128z"/></svg>"""
		else -> null
	}
	
}
