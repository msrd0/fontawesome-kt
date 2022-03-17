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

/** Toilet Paper Slash */
object FA_TOILET_PAPER_SLASH: Icon {
	
	override val name get() = "Toilet Paper Slash"
	
	override val unicode get() = "e072"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M63.98 191.1v172.1c0 41.12-9.75 62.75-31.13 126.9c-3.5 10.25 4.25 20.1 15.13 20.1l280.9-.0059c13.87 0 25.1-8.75 30.37-21.87c10.08-30.15 19.46-57.6 23.1-93.78L66.51 148.8C64.9 162.7 63.98 177.1 63.98 191.1zM630.8 469.1l-109.8-86.02c48.75-9.144 86.94-91.2 86.94-191.1C607.1 86 564.1 0 511.1 0s-96 86-96 191.1c0 49.25 9.362 94.03 24.62 128l-56.62-44.38l.0049-83.65c0-83.62 23.62-153.5 60.5-191.1H159.1C135.2 0 112.7 18.93 95.72 49.72L38.81 5.109C34.41 1.672 29.19 0 24.03 0c-7.125 0-14.19 3.156-18.91 9.187C-3.061 19.62-1.249 34.72 9.189 42.89l591.1 463.1c10.5 8.203 25.56 6.328 33.69-4.078C643.1 492.4 641.2 477.3 630.8 469.1zM479.1 191.1c0-35.37 14.37-64 32-64c17.62 0 32 28.63 32 64S529.6 255.1 511.1 255.1C494.4 255.1 479.1 227.4 479.1 191.1z"/></svg>"""
		else -> null
	}
	
}
