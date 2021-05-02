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

object FA_BUY_N_LARGE: Icon {
	
	override val name get() = "Buy n Large"
	
	override val unicode get() = "f8a6"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M288 32C133.27 32 7.79 132.32 7.79 256S133.27 480 288 480s280.21-100.32 280.21-224S442.73 32 288 32zm-85.39 357.19L64.1 390.55l77.25-290.74h133.44c63.15 0 84.93 28.65 78 72.84a60.24 60.24 0 0 1-1.5 6.85 77.39 77.39 0 0 0-17.21-1.93c-42.35 0-76.69 33.88-76.69 75.65 0 37.14 27.14 68 62.93 74.45-18.24 37.16-56.16 60.92-117.71 61.52zM358 207.11h32l-22.16 90.31h-35.41l-11.19-35.63-7.83 35.63h-37.83l26.63-90.31h31.34l15 36.75zm145.86 182.08H306.79L322.63 328a78.8 78.8 0 0 0 11.47.83c42.34 0 76.69-33.87 76.69-75.65 0-32.65-21-60.46-50.38-71.06l21.33-82.35h92.5l-53.05 205.36h103.87zM211.7 269.39H187l-13.8 56.47h24.7c16.14 0 32.11-3.18 37.94-26.65 5.56-22.31-7.99-29.82-24.14-29.82zM233 170h-21.34L200 217.71h21.37c18 0 35.38-14.64 39.21-30.14C265.23 168.71 251.07 170 233 170z"/></svg>"""
		else -> null
	}
	
}
