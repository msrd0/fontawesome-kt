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

object FA_TOILET_PAPER: Icon {
	
	override val name get() = "Toilet Paper"
	
	override val unicode get() = "f71e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M128 0C74.98 0 32 85.96 32 192v172.07c0 41.12-9.8 62.77-31.17 126.87C-2.62 501.3 5.09 512 16.01 512h280.92c13.77 0 26-8.81 30.36-21.88 12.83-38.48 24.71-72.4 24.71-126.05V192c0-83.6 23.67-153.52 60.44-192H128zM96 224c-8.84 0-16-7.16-16-16s7.16-16 16-16 16 7.16 16 16-7.16 16-16 16zm64 0c-8.84 0-16-7.16-16-16s7.16-16 16-16 16 7.16 16 16-7.16 16-16 16zm64 0c-8.84 0-16-7.16-16-16s7.16-16 16-16 16 7.16 16 16-7.16 16-16 16zm64 0c-8.84 0-16-7.16-16-16s7.16-16 16-16 16 7.16 16 16-7.16 16-16 16zM480 0c-53.02 0-96 85.96-96 192s42.98 192 96 192 96-85.96 96-192S533.02 0 480 0zm0 256c-17.67 0-32-28.65-32-64s14.33-64 32-64 32 28.65 32 64-14.33 64-32 64z"/></svg>"""
		else -> null
	}
	
}
