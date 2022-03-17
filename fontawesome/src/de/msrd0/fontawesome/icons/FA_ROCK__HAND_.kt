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

object FA_ROCK__HAND_: Icon {
	
	override val name get() = "Rock (Hand)"
	
	override val unicode get() = "f255"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M448 144v120.4C448 314.2 422.6 358.1 384 384v128H128v-128l-53.19-38.67C48 325.8 32 294.3 32 261.2V192c0-14.58 6.625-28.38 17.1-37.48L80 130.5V176C80 184.8 87.16 192 96 192s16-7.164 16-16v-128C112 21.48 133.5 0 160 0c25.38 0 45.96 19.77 47.67 44.73C216.2 36.9 227.5 32 240 32C266.5 32 288 53.48 288 80v5.531C296.6 72.57 311.3 64 328 64c23.47 0 42.94 16.87 47.11 39.14C382.4 98.7 390.9 96 400 96C426.5 96 448 117.5 448 144z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M377.1 68.05C364.4 50.65 343.7 40 321.2 40h-13.53c-3.518 0-7.039 .2754-10.53 .8184C284.8 31.33 269.6 26 253.5 26H240c-3.977 0-7.904 .3691-11.75 1.084C216.7 10.71 197.6 0 176 0H160C124.7 0 96 28.65 96 64v49.71L63.04 143.3C43.3 160 32 184.6 32 210.9v78.97c0 32.1 17.11 61.65 44.65 77.12L112 386.9v101.1C112 501.3 122.7 512 135.1 512S160 501.3 160 488v-129.9c-1.316-.6543-2.775-.9199-4.062-1.639l-55.78-31.34C87.72 318.2 80 304.6 80 289.9V210.9c0-12.31 5.281-23.77 14.5-31.39L112 163.8V208C112 216.8 119.2 224 128 224s16-7.156 16-16V64c0-8.828 7.188-16 16-16h16C184.8 48 192 55.17 192 64v16c0 9.578 7.942 16.04 16.15 16.04c6.432 0 12.31-4.018 14.73-10.17C223.3 84.84 228.3 74 240 74h13.53c20.97 0 17.92 19.58 34.27 19.58c8.177 0 9.9-5.584 19.88-5.584h13.53c25.54 0 18.27 28.23 38.66 28.23c.1562 0 .3125-.002 .4668-.0078L375.4 116C388.1 116 400 127.7 400 142V272c0 36.15-19.54 67.32-48 83.69v132.3C352 501.3 362.7 512 375.1 512S400 501.3 400 488v-108.1C430.1 352.8 448 313.6 448 272V142C448 102.1 416.8 69.44 377.1 68.05z"/></svg>"""
		else -> null
	}
	
}

val FA_HAND_ROCK = FA_ROCK__HAND_
