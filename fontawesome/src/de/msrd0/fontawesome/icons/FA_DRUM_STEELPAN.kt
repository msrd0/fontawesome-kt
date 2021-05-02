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

object FA_DRUM_STEELPAN: Icon {
	
	override val name get() = "Drum Steelpan"
	
	override val unicode get() = "f56a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M288 32C128.94 32 0 89.31 0 160v192c0 70.69 128.94 128 288 128s288-57.31 288-128V160c0-70.69-128.94-128-288-128zm-82.99 158.36c-4.45 16.61-14.54 30.57-28.31 40.48C100.23 217.46 48 190.78 48 160c0-30.16 50.11-56.39 124.04-70.03l25.6 44.34c9.86 17.09 12.48 36.99 7.37 56.05zM288 240c-21.08 0-41.41-1-60.89-2.7 8.06-26.13 32.15-45.3 60.89-45.3s52.83 19.17 60.89 45.3C329.41 239 309.08 240 288 240zm64-144c0 35.29-28.71 64-64 64s-64-28.71-64-64V82.96c20.4-1.88 41.8-2.96 64-2.96s43.6 1.08 64 2.96V96zm46.93 134.9c-13.81-9.91-23.94-23.9-28.4-40.54-5.11-19.06-2.49-38.96 7.38-56.04l25.65-44.42C477.72 103.5 528 129.79 528 160c0 30.83-52.4 57.54-129.07 70.9z"/></svg>"""
		else -> null
	}
	
}
