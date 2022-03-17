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
import de.msrd0.fontawesome.Style.REGULAR

object FA_LIZARD__HAND_: Icon {
	
	override val name get() = "Lizard (Hand)"
	
	override val unicode get() = "f258"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M512 329.1V432c0 8.836-7.164 16-16 16H368c-8.836 0-16-7.164-16-16V416l-85.33-64H95.1c-16.47 0-31.44-13.44-31.96-29.9C62.87 285.8 91.96 256 127.1 256h104.9c13.77 0 26-8.811 30.36-21.88l10.67-32C280.9 181.4 265.4 160 243.6 160H63.1C27.95 160-1.129 130.2 .0352 93.9C.5625 77.44 15.53 64 31.1 64h271.2c26.26 0 50.84 12.88 65.79 34.47l128.8 185.1C507 297.8 512 313.7 512 329.1z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M512 331.8V424c0 13.25-10.75 24-24 24c-13.25 0-24-10.75-24-24v-92.17c0-10.09-3.031-19.8-8.766-28.08l-118.6-170.5C327.4 119.1 312.2 112 295.1 112H53.32c-2.5 0-5.25 2.453-5.313 4.172c-.2969 9.5 3.156 18.47 9.75 25.28C64.36 148.3 73.2 152 82.67 152h161.8c17.09 0 33.4 8.281 43.4 22.14c9.984 13.88 12.73 31.83 7.328 48.05l-9.781 29.34C278.2 273.3 257.8 288 234.9 288H138.7C129.2 288 120.4 291.8 113.8 298.5c-6.594 6.812-10.05 15.78-9.75 25.28C104.1 325.5 106.8 328 109.3 328h156.6c5.188 0 10.14 1.688 14.3 4.797l78.22 58.67c6.031 4.531 9.594 11.66 9.594 19.2L367.1 424c0 13.25-10.75 24-24 24s-24-10.75-24-24v-1.328L257.8 376H109.3c-28.48 0-52.39-22.72-53.28-50.64c-.7187-22.61 7.531-43.98 23.23-60.2C94.1 248.9 116.1 240 138.7 240h96.19c2.297 0 4.328-1.469 5.063-3.656l9.781-29.33c.7031-2.141-.0156-3.797-.7344-4.797C248.2 201.2 246.9 200 244.6 200H82.67c-22.58 0-43.67-8.938-59.39-25.16C7.575 158.6-.6755 137.3 .0433 114.6C.9339 86.72 24.84 64 53.32 64h242.7c31.94 0 61.86 15.67 80.05 41.92l118.6 170.5C506 292.8 512 311.9 512 331.8z"/></svg>"""
		else -> null
	}
	
}
