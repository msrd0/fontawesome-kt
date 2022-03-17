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

/** Republican */
object FA_REPUBLICAN: Icon {
	
	override val name get() = "Republican"
	
	override val unicode get() = "f75e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M544 191.1c0-88.37-71.62-159.1-159.1-159.1L159.1 32C71.62 32 0 103.6 0 191.1l.025 63.98h543.1V191.1zM176.3 170.4l-19.75 19.37l4.75 27.25c.7498 4.875-4.375 8.625-8.75 6.25l-24.5-12.87L103.5 223.2C99.27 225.6 94.02 221.9 94.77 216.1l4.75-27.25l-19.75-19.37C76.15 166.9 78.15 160.9 83.02 160.2L110.4 156.2l12.25-24.87c2.125-4.5 8.625-4.375 10.62 0L145.5 156.2L172.9 160.2C177.9 160.9 179.8 166.9 176.3 170.4zM320.3 170.4l-19.75 19.37l4.75 27.25c.7498 4.875-4.375 8.625-8.75 6.25L272 210.4l-24.5 12.87C243.3 225.6 238 221.9 238.8 216.1L243.5 189.7l-19.75-19.37c-3.625-3.5-1.625-9.498 3.25-10.12L254.4 156.2l12.25-24.87c2.125-4.5 8.625-4.375 10.62 0L289.5 156.2l27.37 4C321.9 160.9 323.8 166.9 320.3 170.4zM464.3 170.4l-19.75 19.37l4.75 27.25c.7498 4.875-4.375 8.625-8.75 6.25l-24.5-12.87l-24.5 12.87c-4.25 2.375-9.5-1.375-8.75-6.25l4.75-27.25l-19.75-19.37c-3.625-3.5-1.625-9.498 3.25-10.12l27.37-4l12.25-24.87c2.125-4.5 8.625-4.375 10.62 0l12.25 24.87l27.37 4C465.9 160.9 467.8 166.9 464.3 170.4zM624 319.1L592 319.1c-8.799 0-15.1 7.199-15.1 15.1v63.99c0 8.748-7.25 15.1-15.1 15.1c-8.75 0-15.1-7.25-15.1-15.1l-.0313-111.1L.025 287.1v159.1c0 17.6 14.4 31.1 31.1 31.1L95.98 479.1c17.6 0 32.04-14.4 32.04-32v-63.98l191.1-.0169v63.99c0 17.6 14.36 32 31.96 32l64.04 .013c17.6 0 31.1-14.4 31.1-31.1l-.0417-96.01l32.04 .0006v43.25c0 41.79 29.91 80.03 71.48 84.35C599.3 484.5 640 446.9 640 399.1v-63.98C640 327.2 632.8 319.1 624 319.1z"/></svg>"""
		else -> null
	}
	
}
